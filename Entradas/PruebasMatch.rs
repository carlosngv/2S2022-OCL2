mod prueba {
    fn main(){
        let val: i64 = 23;
        match(val) {
            12 => {
                println!("entra al 12");
            }
            23 => {
                println!("Entra al correcto!");
            }
            _ => {
                println!("default");
            }
        }
    }
}
