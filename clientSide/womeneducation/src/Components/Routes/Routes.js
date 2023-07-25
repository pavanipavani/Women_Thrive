import React from "react";
import { BrowserRouter, Route, Routes } from 'react-router-dom'; 
import Homepage from "../Home/Homepage";
import DisplayCourseData from "../Course/Course";
import UnitData from "../Unit/unit";

function RoutesData (){
    return (
        <div>
            <BrowserRouter>
                <Routes>
                    <Route path="/course" element={<DisplayCourseData />} />
                    <Route path="/" exact element={<Homepage />} />
                    <Route path="/homepage" element={<Homepage />} />
                    <Route path="/course" element={<UnitData />} />

                </Routes>
            </BrowserRouter>
        </div>
    );
}
export default RoutesData;
