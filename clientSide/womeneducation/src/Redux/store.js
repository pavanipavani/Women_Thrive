import { createStore, applyMiddleware, combineReducers, compose } from "redux";

import CourseDetails from "./ProductReducer/reducer"

import thunk from "redux-thunk";

const rootReducer = combineReducers({ course : CourseDetails, unit: CourseDetails});

const composeEnhancers = window.__REDUX_DEVTOOLS_EXTENSION_COMPOSE__ || compose;

export const store = createStore(
  rootReducer,
  composeEnhancers(applyMiddleware(thunk))
);