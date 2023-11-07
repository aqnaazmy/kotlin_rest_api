package id.plugin.kotlinrestapi

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class datadiri {

    data class DataDiri(val nama: String, val umur: Int, val alamat: String)
    data class Result(val message: String, val status_code: Int, val dataDiri: DataDiri)

    @GetMapping("/aqna")
    fun getDataDiri(): ResponseEntity<Result> {
        val dataDiri = DataDiri("aqnaazmy", 20, "Rengas Empire")
        val result = Result("operation successful", HttpStatus.OK.value(), dataDiri)
        return ResponseEntity.ok(result)
    }
}

