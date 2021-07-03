import React from 'react';
import FibService from '../services/FibService';

class FibComponent extends React.Component {

    constructor(props){

        super(props);

        this.state={
            elements:0,
            fibs:"",
            sorted:""
            
        };
        
        this.changeElementsHandler = this.changeElementsHandler.bind(this);
        this.getFib = this.getFib.bind(this);
                
    }

    componentDidMount(){
        FibService.getFib(this.state.elements).then( res => {

            this.setState({fibs: res.data.fibonacci.join(",")});
            this.setState({sorted: res.data.sorted.join(",")});
        
        })
    }
    
    changeElementsHandler= (event) => {
        this.setState({elements: event.target.value});

    }
    
    getFib(){
        FibService.getFib(this.state.elements).then( res => {
            this.setState({fibs: res.data.fibonacci.join(",")});
            this.setState({sorted: res.data.sorted.join(",")});
        })

        
    }
  
    render(){
        return(

            <div className="container">       
                
                <p>Enter a number between 1 to 100.</p>    

                <input value={this.state.elements} onChange={this.changeElementsHandler}/> 

                <button class="btn btn-primary mb-2" onClick={this.getFib}>Calculate</button>
                               
                <div>
                
                Fibonacci: {this.state.fibs}

                </div>

                <div>
                
                Sorted: {this.state.sorted}

                </div>

            </div>
        )
    }
    
}

export default FibComponent
