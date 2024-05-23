package kr.ac.kopo.dialog2024

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnDialog = findViewById<Button>(R.id.btnDialog)

        btnDialog.setOnClickListener{
            // 체크박스 버튼 목록 대화상자
            var placesArr = arrayOf("에펠탑", "빅벤", "피렌체")
            var selectArr = booleanArrayOf(false, true, false)
            var dialog = AlertDialog.Builder(this@MainActivity)
            dialog.setTitle("좋아하는 핫플레이스")
            dialog.setIcon(R.drawable.icon1)
            dialog.setMultiChoiceItems(placesArr, selectArr){ d1, which, isChecked ->
                btnDialog.text = placesArr[which]

            }
            dialog.setPositiveButton("닫기", null)
            dialog.show()

        }
    }
}