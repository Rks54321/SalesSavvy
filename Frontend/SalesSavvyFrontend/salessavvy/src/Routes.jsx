import { Routes, Route } from "react-router-dom";
import RegistrationPage from "./RegistrationPage";
import LoginPage from "./LoginPage";


const AppRoutes = () => {
    return (
        <Routes>
            <Route path='/register' element={<RegistrationPage/>}/>
            <Route path="/" element={<LoginPage/>}/>
        </Routes>
    )
}

export default AppRoutes;