import React from "react";
import './Forgot.css'
import { Link } from "react-router-dom";
function Forgot()
{
    return(
        <div>
            <div>
                <img className="forgotbackgroundimg" src="resources/womenlearning.png" alt="img" />
            </div>
            <div class="flex2">
            <div class="forgotpage">
                <div className="title4"><b>Forgot Password</b></div>
                <div className="margin4">
                    <input type="text" placeholder="Username" />
                    <input type="password" placeholder="New Password" />
                    <input type="password" placeholder="conform password" />
                    <button className="button">Update</button>
                    <div className="login">
                       <Link to="/login"> <span className="logintext">Login</span></Link>
                    </div>
                </div>
                </div>
            </div>
        </div>
    )
}
export default Forgot;