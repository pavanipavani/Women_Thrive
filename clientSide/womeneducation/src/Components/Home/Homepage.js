import React from "react";
import './Homepage.css';
import Footer from "../Footer/Footer";
import NavBar from "../Navbar/NavBar";
// import { Link } from "react-router-dom";
import { EducationData, HomeConstant, WhyEducation } from "../Constant/constantdata";

function Homepage (){
    return (
        <div>
            <NavBar/>
            <div className="welcomepage">
                <img className="welcomeimage" src="resources/gif.gif" alt="img" />
            </div>
            <div className="homepageborder">
                {
                    HomeConstant.map((element) =>(
                        <p className="hometext">{element}</p>
                    ))
                }
            </div>
            <div className="educationimage">
                <img className="womenimagesize" src="resources/women.png" alt="img" />
            </div>
            <div>
                    <p className="educationtext">{EducationData}</p>
            </div>
            
            <div>
                <p className="womeneducationtitle">{WhyEducation.title}</p>
                <div className="achieveimage">
                    <img className="achieveimagesize" src="resources/achives.jpg " alt= "img"/>
                </div>
                <div className="whyeducation">
                {
                    WhyEducation.data.map((element,index) =>(
                        <p key={index}>{element}</p>
                    ))
                }
                </div>
            </div>
            <Footer/>
        </div>
    )
}
export default Homepage;