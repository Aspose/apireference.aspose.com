---
title: "System::Drawing::Graphics::DrawString yöntemi"
linktitle: "DrawString"
second_title: "Aspose.Font için C++"
description: "System::Drawing::Graphics::DrawString yöntemi. Belirtilen dizeyi, belirtilen konumda, belirtilen yazı tipi ve fırça kullanarak C++'de çizer."
type: docs
weight: 2800
url: /tr/cpp/system.drawing/graphics/drawstring/
---
## Graphics::DrawString(const String\&, const SharedPtr\<Font\>\&, const SharedPtr\<Brush\>\&, float, float, const System::SharedPtr\<System::Drawing::StringFormat\>\&) method


Belirtilen konumda belirtilen dizeyi belirtilen yazı tipi ve fırça ile çizer.

```cpp
void System::Drawing::Graphics::DrawString(const String &str, const SharedPtr<Font> &font, const SharedPtr<Brush> &brush, float x, float y, const System::SharedPtr<System::Drawing::StringFormat> &stringFormat=nullptr)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| str | const String\& | Çizilecek dize |
| font | const SharedPtr\<Font\>\& | Kullanılacak bir yazı tipi |
| brush | const SharedPtr\<Brush\>\& | Çizim için kullanılacak bir [Brush](../../brush/) nesnesi |
| x | float | Çizilen dizeyin sol üst köşesinin konumunun X koordinatı |
| y | float | Çizilen dizeyin sol üst köşesinin konumunun Y koordinatı |
| stringFormat | const System::SharedPtr\<System::Drawing::StringFormat\>\& | Dizenin biçimini belirtti |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [Brush](../../brush/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Graphics::DrawString(const String\&, const SharedPtr\<Font\>\&, const SharedPtr\<Brush\>\&, PointF, const System::SharedPtr\<System::Drawing::StringFormat\>\&) method


Belirtilen konumda belirtilen dizeyi belirtilen yazı tipi ve fırça ile çizer.

```cpp
void System::Drawing::Graphics::DrawString(const String &str, const SharedPtr<Font> &font, const SharedPtr<Brush> &brush, PointF topLeft, const System::SharedPtr<System::Drawing::StringFormat> &stringFormat=nullptr)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| str | const String\& | Çizilecek dize |
| font | const SharedPtr\<Font\>\& | Kullanılacak bir yazı tipi |
| brush | const SharedPtr\<Brush\>\& | Çizim için kullanılacak bir [Brush](../../brush/) nesnesi |
| topLeft | PointF | Çizilen dizeyin sol üst köşesinin konumunu belirtir |
| stringFormat | const System::SharedPtr\<System::Drawing::StringFormat\>\& | Dizenin biçimini belirtti |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [Brush](../../brush/)
* Class [PointF](../../pointf/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Graphics::DrawString(const String\&, const SharedPtr\<Font\>\&, const SharedPtr\<Brush\>\&, RectangleF, const System::SharedPtr\<System::Drawing::StringFormat\>\&) method


Belirtilen dikdörtgende belirtilen dizeyi belirtilen yazı tipi ve fırça ile çizer.

```cpp
void System::Drawing::Graphics::DrawString(const String &str, const SharedPtr<Font> &font, const SharedPtr<Brush> &brush, RectangleF layoutRectangle, const System::SharedPtr<System::Drawing::StringFormat> &stringFormat=nullptr)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| str | const String\& | Çizilecek dize |
| font | const SharedPtr\<Font\>\& | Kullanılacak bir yazı tipi |
| brush | const SharedPtr\<Brush\>\& | Çizim için kullanılacak bir [Brush](../../brush/) nesnesi |
| layoutRectangle | RectangleF | Dizeyi çizmek için bir dikdörtgen belirtir |
| stringFormat | const System::SharedPtr\<System::Drawing::StringFormat\>\& | Dizenin biçimini belirtti |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [Brush](../../brush/)
* Class [RectangleF](../../rectanglef/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
