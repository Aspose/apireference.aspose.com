---
title: "Aspose::Page::EPS::PsDocument::DrawTransparentImage method"
linktitle: "DrawTransparentImage"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::EPS::PsDocument::DrawTransparentImage method. Dönüştürülmüş şeffaf görüntüyü çizer. Görüntünün Alfa kanalı yoksa C++'ta opak bir görüntü olarak çizilir."
type: docs
weight: 2000
url: /tr/cpp/aspose.page.eps/psdocument/drawtransparentimage/
---
## PsDocument::DrawTransparentImage method


Dönüştürülmüş şeffaf görüntüyü çizer. Görüntünün Alpha kanalı yoksa opak görüntü olarak çizilir.

```cpp
void Aspose::Page::EPS::PsDocument::DrawTransparentImage(System::SharedPtr<System::Drawing::Bitmap> image, System::SharedPtr<System::Drawing::Drawing2D::Matrix> transform, int32_t transparencyThreshold)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| görüntü | System::SharedPtr\<System::Drawing::Bitmap\> | Çizilecek görüntü. |
| dönüşüm | System::SharedPtr\<System::Drawing::Drawing2D::Matrix\> | Görüntüyü dönüştürmek için matris. |
| transparencyThreshold | int32_t | Şeffaflık eşik değeri, pikselin hangi şeffaflık değerinden itibaren tamamen şeffaf olarak yorumlanacağını tanımlar. Bu eşik değerinin altındaki tüm değerler tamamen opak olarak yorumlanır. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Bitmap](../../../system.drawing/bitmap/)
* Class [Matrix](../../../system.drawing.drawing2d/matrix/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
