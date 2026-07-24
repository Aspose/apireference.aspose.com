---
title: "Aspose::Page::EPS::PsDocument::DrawTransparentImage metode"
linktitle: "DrawTransparentImage"
second_title: "Aspose.Page untuk C++"
description: "Aspose::Page::EPS::PsDocument::DrawTransparentImage metode. Menggambar gambar transparan yang telah ditransformasi. Jika gambar tidak memiliki saluran Alpha, gambar akan digambar sebagai gambar buram dalam C++."
type: docs
weight: 2000
url: /id/cpp/aspose.page.eps/psdocument/drawtransparentimage/
---
## PsDocument::DrawTransparentImage method


Menggambar gambar transparan yang diubah. Jika gambar tidak memiliki saluran Alpha, gambar akan digambar sebagai gambar buram.

```cpp
void Aspose::Page::EPS::PsDocument::DrawTransparentImage(System::SharedPtr<System::Drawing::Bitmap> image, System::SharedPtr<System::Drawing::Drawing2D::Matrix> transform, int32_t transparencyThreshold)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| gambar | System::SharedPtr\<System::Drawing::Bitmap\> | Gambar yang akan digambar. |
| transform | System::SharedPtr\<System::Drawing::Drawing2D::Matrix\> | Matriks untuk mentransformasi gambar. |
| transparencyThreshold | int32_t | Ambang batas yang menentukan nilai transparansi mana piksel akan diinterpretasikan sebagai sepenuhnya transparan. Semua nilai di bawah ambang batas ini akan diinterpretasikan sebagai sepenuhnya buram. |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Bitmap](../../../system.drawing/bitmap/)
* Class [Matrix](../../../system.drawing.drawing2d/matrix/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
