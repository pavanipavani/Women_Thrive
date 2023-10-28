import React from 'react';
import './Login.css';
 import {Link} from 'react-router-dom';
function Login()
{
    return(
        <div>
            <div>
                <img className='backgroungimage1' src="resources/womenlearning.png" alt="img" />
            </div>
           <div className="flex">
            <div className='loginpage'>
                <div className='title1'><b>Login</b></div>
                <div className='margin3'>
                    <input type="text" placeholder="Username" />
                    <input type="password" placeholder="Password" />
                    <button className='button'>Login</button>
                    <div className='pass'>
                        <span className='forgot'><Link to='/forgot'> forgot password?</Link></span>
                        <div className='user'>New user? 
                            <span ><Link to="/signup"> Signup</Link></span>
                        </div>
                        <div className='connect'><b>OR</b></div>
                        <div className='display1'>
                            <img className='connectimages' src="resources/Google.png" alt="img" />
                            <img className='connectimages' src="resources/Linkedin.png" alt="img" />
                            <img className='connectimages' src="resources/twitter.png" alt="img" />
                            <img className='connectimages' src="resources/facebook.png" alt="img" />
                        </div>
                    </div>
                    </div>
                </div>
               
            </div>
        </div>
    )
}
export default Login;