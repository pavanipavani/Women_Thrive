import React from "react";
import './NavBar.css';
import {Link, useNavigate} from 'react-router-dom';
import {useDispatch} from "react-redux";
import { getAllCourse } from '../../Redux/ProductReducer/action';

function NavBar(){
    const dispatch = useDispatch()
    const navigate = useNavigate()
    const courseDisplay = async () => {
        await dispatch(getAllCourse())
        navigate("/course")
    }
    return (
    <div className="nav">
        <div className='navbar'>
        <Link to="/homepage"><img className="imagesize1" src="resources/jtdimage.jpeg" alt="img" /></Link>
        </div>

        <div className="navbar" >
        <img className="imagesize1" src="resources/livebooks.png" alt="img" onClick={() => courseDisplay()}/>
        </div>
        <div className="navbar navbar1">
        <Link to='/signup'><img className="imagesize1 imagesize " src="resources/signupimage.png" alt="img" /></Link>
        </div>
    </div>
    )
}
export default NavBar;