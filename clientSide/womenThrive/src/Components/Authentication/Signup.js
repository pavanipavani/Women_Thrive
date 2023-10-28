import React, { useState } from 'react';
import './Signup.css';
import { Link } from 'react-router-dom';

function Signup(){
    const [formdata , setFormdata] = useState();
    return(
        <div>
            <div>
                <img className='backgroundimage' src="resources/womenlearning.png" alt="img" />
            </div>
            <div className="flex1">
               
                <div className="signupbox">
                        
                        <div className='margin2'>
                        
                        <input type="text" placeholder="Name" />
                      
                        <input type="text" placeholder="Username" />
                       
                        <input type="text" placeholder="Email" />
                       
                        <input type="password" placeholder='password' />
                        
                       
                        <button className="signupbutton">Sign up</button>
                         <div className='login'>Already have an account<span><Link to="/login">Login</Link></span></div> 
                        <div className='or'>OR</div>
                    
                    <div className='display2'>
                        <img className='imagesize3' src="resources/Google.png" alt="img" />
                        <img className='imagesize3' src="resources/Linkedin.png" alt="img" />
                        <img className='imagesize3' src="resources/twitter.png" alt="img" />
                        <img className='imagesize3' src="resources/facebook.png" alt="img" />
                    </div>
                </div>
                </div>  
            </div>
        </div> 
    )
}
export default Signup;