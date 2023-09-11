package com.ghuljr.sharebox.ui.screens

import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ghuljr.sharebox.ui.theme.ShareBoxTheme
import com.ghuljr.sharebox.ui.utils.loremIpsum

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NoteScreen() {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior(),
                title = {
                    Text(
                        text = "ShareBox",
                        style = MaterialTheme.typography.titleSmall
                    )
                }
            )
        }
    ) { Greeting(name = loremIpsum()) }
}

@Composable
@Preview(
    showBackground = true,
    showSystemUi = true
)
fun NoteScreenPreview() {
    ShareBoxTheme {
        Surface {
            NoteScreen()
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier,
        style = MaterialTheme.typography.bodySmall
    )
}