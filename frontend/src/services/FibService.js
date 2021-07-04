import axios from 'axios'

const FIB_REST_URL = 'http://localhost:8080/fibonacci';
//For deploy on Oracle cloud
//const FIB_REST_URL = 'http://168.138.8.198:8080/fibonacci';

class FibService{

    getFib(elements){
        return axios.get(FIB_REST_URL + "?elements=" + elements);
    }
}

export default new FibService();