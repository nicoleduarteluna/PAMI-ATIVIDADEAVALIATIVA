package br.com.etechoracio.avaliacao.Service;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;


public interface ProjetoAPIService {
    @GET ("divisao/{num1}/{num2}")
    Call<String> executar (@Path("num1")String num1, @Path("num2") String num2);


}
