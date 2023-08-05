package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    var rvitems= arrayListOf<rv_datamodelclass>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        rvitems= ArrayList<rv_datamodelclass>()


        rvitems.add(rv_datamodelclass("manish","9805304702"))
        rvitems.add(rv_datamodelclass("ravi","8219412826"))
        rvitems.add(rv_datamodelclass("minakshi","980652231"))
        rvitems.add(rv_datamodelclass("Priya","987654321"))
        rvitems.add(rv_datamodelclass("deepak","980756432"))
        rvitems.add(rv_datamodelclass("pooja","98053087652"))
        rvitems.add(rv_datamodelclass("Meena","8907304702"))
        rvitems.add(rv_datamodelclass("pankaj","91425304702"))
        rvitems.add(rv_datamodelclass("Suresh","8876504702"))
        rvitems.add(rv_datamodelclass("anjali","98034564702"))
        rvitems.add(rv_datamodelclass("Priya","987654321"))
        rvitems.add(rv_datamodelclass("deepak","980756432"))
        rvitems.add(rv_datamodelclass("pooja","98053087652"))

        binding.rv.layoutManager=LinearLayoutManager(this, RecyclerView.VERTICAL,false)
        binding.rv.adapter=my_adapter(this,rvitems)


    }
}