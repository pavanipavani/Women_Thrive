import React from "react";
import './unit.css';
import { useSelector } from "react-redux";


function UnitData(){
    const unitsData = useSelector(state =>state.unit.unitsData)
    console.log(unitsData);
    return(
        <div className="unitsinfo">
            {
                unitsData?.map(({units_NAME})=>
                <div className="unitsinformation">
                    <img className="diamondimage" src="resources/diamond.jpg" alt="img" />
                    <p className="untisdata">{units_NAME}</p>
                    <div className="downarrowbox">
                        <img className="downarrowimg" src="resources/downarrow.jpg" alt="img" />
                    </div>
                </div>
                )
            }
        </div>
    )
}
export default UnitData