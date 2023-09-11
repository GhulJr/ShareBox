package com.ghuljr.sharebox.ui.components

import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import com.ghuljr.sharebox.R
import com.ghuljr.sharebox.ui.theme.ShareBoxTheme

@Composable
fun ShareBoxIconButton(
    imageVector: ImageVector,
    contentDescription: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    IconButton(
        modifier = modifier,
        onClick = onClick
    ) {
        Icon(
            imageVector = imageVector,
            contentDescription = contentDescription
        )
    }
}

@Composable
@Preview(
    showBackground = true,
    showSystemUi = true
)
fun ShareBoxIconButtonPreview() {
    ShareBoxTheme {
        ShareBoxIconButton(
            imageVector = ImageVector.vectorResource(id = R.drawable.ic_unlocked),
            contentDescription = "Preview Icon button",
            onClick = { }
        )
    }
}