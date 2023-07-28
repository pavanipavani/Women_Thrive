import React from "react";
import './unit.css';
import { useSelector } from "react-redux";

    function UnitData({ click }) { 
    const unitsData = useSelector((state) => state.unit.unitsData);
    console.log(unitsData);

    return(
        <div className="unitsinfo">
            {
               (click && unitsData)&& unitsData?.map(({units_NAME})=>
                
                <div className="unitsinformation">
                    <img className="diamondimage" src="resources/diamond.jpg" alt="img" />
                    <p className="untisdata">{units_NAME}</p>
                    <div className="downarrowbox">
                        <img className="downarrowimg" src="resources/downarrow.jpg" alt="img" />
                    </div>
                </div>
              
                )
            }
           {!click && <div>
                <img className="selectcourseimage" src="resources/welcome.png" alt="img" />
            </div>}
        </div>
    )
}
export default UnitData