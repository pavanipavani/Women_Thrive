import React, { useState } from 'react';
import Footer from '../Footer/Footer';
import './Course.css';
import {useSelector} from "react-redux";
import NavBar from '../Navbar/NavBar';
import {useDispatch} from "react-redux";
import { getAllUnits } from '../../Redux/ProductReducer/action';
import { useNavigate } from 'react-router';
import UnitData from "../Unit/unit"

const DisplayCourseData = () => {
    const [click, setClick ] = useState(false);
    const courseData = useSelector(state => state.course.courseData)
    console.log(courseData)
    
    const dispatch = useDispatch()
    const navigate = useNavigate()
    const unitsDisplay = async () => {
        setClick(true);
        await dispatch(getAllUnits())
        navigate("/course")
    }
   const [search,setSearch] = useState("")
    return(
        <div>
            <NavBar/>
            <div className="display">
                <div className="title">
                    <div className="margin">
                        <div className="titletext"><b>Learn the ways of the future</b></div>
                        <div className="titletext1">Explore education with<b className='bold'> WomanThrive</b>'s top-notch curriculum and leading experts</div>
                    </div>
                    <div className="margin1">
                        <img className="titleimg" src="resources/navimage.png" alt="img" />
                    </div>       
                </div>
                    <div className="coursedetails">
                       
                    <div>
                        <div>
                            <input className='a' type='text' placeholder='search course'onChange={(e) =>{setSearch(e.target.value)}} />
                        </div>
                        {
                            courseData.filter((element)=>{
                                if(element.course_NAME.toLowerCase().includes(search.toLocaleLowerCase())){
                                    return element;
                                }
                            })
                            ?.map(({course_NAME}) => 
                            <div className='courseinfo'>
                                <div className='coursedatainfo' onClick ={() =>unitsDisplay(click)}>{course_NAME} </div>
                            </div>
                            )
                        }
                    </div>
                    <div>
                    <UnitData click={click} />
                    </div>
                </div>
            </div>
            <Footer/>
        </div>
    )
}
export default DisplayCourseData;