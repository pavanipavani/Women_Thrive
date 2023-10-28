import React from "react";
import { BrowserRouter, Route, Routes } from 'react-router-dom'; 
import Homepage from "../Home/index";
import DisplayCourseData from "../Course/Course";
import UnitData from "../Unit/unit";
import Signup from "../Authentication/Signup";
import Login from "../Authentication/Login";
import Forgot from "../Authentication/Forgot";
function RoutesData (){
    return (
        <div>
            <BrowserRouter>
                <Routes>
                    <Route path="/course" element={<DisplayCourseData />} />
                    <Route path="/" exact element={<Homepage />} />
                    <Route path="/homepage" element={<Homepage />} />
                    <Route path="/course" element={<UnitData />} />
                    <Route path="/signup" element={<Signup />}/>
                    <Route path="/login" element={<Login />} />
                    <Route path="/forgot" element={<Forgot />} />
                </Routes>
            </BrowserRouter>
        </div>
    );
}
export default RoutesData;
