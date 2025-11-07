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

