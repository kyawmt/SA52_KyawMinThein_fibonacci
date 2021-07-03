import logo from './logo.svg';
import './App.css';
import {BrowserRouter, Switch, Route }  from "react-router-dom";
import FibComponent from './components/FibComponent';

function App() {
  return (
    
  <BrowserRouter>
  <Switch>

    <Route path="/fibonacci" component={FibComponent}/>
    
  </Switch>
  </BrowserRouter>
  );
}

export default App;
