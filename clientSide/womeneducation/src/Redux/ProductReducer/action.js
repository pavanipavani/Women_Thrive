import {
    GET_ALL_COURSE_REQUEST,
    GET_ALL_COURSE_FAILURE,
    GET_ALL_COURSE_SUCCESS,

    GET_ALL_UNITS_REQUEST,
    GET_ALL_UNITS_FAILURE,
    GET_ALL_UNITS_SUCCESS,

}from "./actionTypes";

import axios from "axios";
export const getAllCourseRequest = () => ({
    type: GET_ALL_COURSE_REQUEST,
  });
  export const getAllCourseFailure = () => ({
    type: GET_ALL_COURSE_FAILURE,
  });
  
  export const getAllCourseSuccess = (payload) => ({
    type: GET_ALL_COURSE_SUCCESS,
    payload,
  });

  export const getAllCourse = () => (dispatch) => {
    dispatch(getAllCourseRequest());
    axios.get("http://localhost:8080/cource")
      .then((res) => dispatch(getAllCourseSuccess(res.data)))
      .catch(() => dispatch(getAllCourseFailure()));
  };

  export const getAllUnitsRequest = () => ({
    type:GET_ALL_UNITS_REQUEST,
  });

  export const getAllUnitsFailure = () => ({
    type :GET_ALL_UNITS_FAILURE,
  });

  export const getAllUnitsSuccess = (payload) =>({
    type :GET_ALL_UNITS_SUCCESS,
    payload,
  });

  export const getAllUnits = () => (dispatch) =>{
    dispatch(getAllUnitsRequest());
    axios.get("http://localhost:8080/units")
    .then((res) => dispatch(getAllUnitsSuccess(res.data)))
    .catch(() =>dispatch(getAllUnitsSuccess()));
  }
   