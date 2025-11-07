@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.navigasitugas.view
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TampilData(
    nama: String,
    jk: String,
    status: String,
    alamat: String,
    onBackBtnClick: () -> Unit,
    onFormulirClick: () -> Unit
) {
    val items = listOf(
        Pair("NAMA LENGKAP", nama),
        Pair("JENIS KELAMIN", jk),
        Pair("STATUS PERKAWINAN", status),
        Pair("ALAMAT", alamat)
    )
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Data Tersimpan",
                        color = Color.White
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color(0xFF9575CD))
            )
        }
    ) { isiRuang ->
        Column(
            modifier = Modifier
                .padding(isiRuang)
                .fillMaxSize()
                .background(Color(0xFFEDE7F6)),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            ElevatedCard(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(0.9f),
                elevation = CardDefaults.cardElevation(8.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White)
            ) {
                Column(
                    modifier = Modifier.padding(20.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    items.forEach { item ->
                        Column {

                            Text(
                                text = item.first,
                                fontSize = 14.sp,
                                color = Color.Black
                            )
                            Text(
                                text = item.second,
                                fontSize = 22.sp,
                                color = Color.Black,
                                fontWeight = androidx.compose.ui.text.font.FontWeight.Bold
                            )
                        }

                        Divider(
                            thickness = 1.dp,
                            color = Color(0xFF9575CD)
                        )
                    }
                }
                Spacer(modifier = Modifier.height(20.dp))

                Button(
                    onClick = onBackBtnClick,
                    modifier = Modifier
                        .fillMaxWidth(0.7f)
                        .height(50.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF2196F3)
                    )
                ) {
                    Text("Kembali ke Beranda", color = Color.White, fontSize = 16.sp)
                }

                Spacer(modifier = Modifier.height(10.dp))

                Button(
                    onClick = onFormulirClick,
                    modifier = Modifier
                        .fillMaxWidth(0.7f)
                        .height(50.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF7E57C2) // Ungu seperti tombol submit form
                    )
                ) {
                    Text("Isi Formulir Lagi", color = Color.White, fontSize = 16.sp)
                }
            }
        }
    }
}


