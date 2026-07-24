---
title: "System::Drawing::RectangleF sınıfı"
linktitle: "RectangleF"
second_title: "Aspose.Page için C++"
description: "System::Drawing::RectangleF sınıfı. Görüntünün sol üst köşesinin tek duyarlıklı kayan nokta X ve Y koordinatları ile genişlik ve yüksekliği olarak tanımlanan dikdörtgen bir alanı temsil eder. Bu tür yığıt üzerinde tahsis edilmeli ve fonksiyonlara değer ya da referans olarak geçirilmelidir. C++'ta bu tür nesneleri yönetmek için System::SmartPtr sınıfını asla kullanmayın."
type: docs
weight: 2000
url: /tr/cpp/system.drawing/rectanglef/
---
## RectangleF class


Görüntünün sol üst köşesinin tek duyarlıklı kayan nokta X ve Y koordinatları ile genişlik ve yüksekliği olarak tanımlanan dikdörtgen bir alanı temsil eder. Bu tür yığıt üzerinde tahsis edilmeli ve fonksiyonlara değer ya da referans olarak geçirilmelidir. Bu tür nesneleri yönetmek için asla [System::SmartPtr](../../system/smartptr/) sınıfını kullanmayın.

```cpp
class RectangleF
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Contains](./contains/)(float, float) | Belirtilen noktanın, geçerli nesne tarafından temsil edilen dikdörtgenin içinde olup olmadığını belirler. |
| [Contains](./contains/)(const PointF\&) | Belirtilen noktanın, geçerli nesne tarafından temsil edilen dikdörtgenin içinde olup olmadığını belirler. |
| [Contains](./contains/)(const RectangleF\&) | Belirtilen dikdörtgenin, geçerli nesne tarafından temsil edilen dikdörtgenin içinde olup olmadığını belirler. |
| [Equals](./equals/)(const RectangleF\&) const | Geçerli ve belirtilen nesneler tarafından temsil edilen dikdörtgenlerin aynı olup olmadığını belirler. |
| static [FromLTRB](./fromltrb/)(float, float, float, float) | Belirtilen kenar konumlarıyla bir dikdörtgeni temsil eden yeni bir [RectangleF](./) nesnesi oluşturur. |
| [get_Bottom](./get_bottom/)() const | Geçerli nesne tarafından temsil edilen dikdörtgenin alt kenarının y koordinatını döndürür. |
| [get_Height](./get_height/)() const | Geçerli nesne tarafından temsil edilen dikdörtgenin yüksekliğini döndürür. |
| [get_IsEmpty](./get_isempty/)() const | Geçerli nesne tarafından temsil edilen dikdörtgenin sol üst köşesinin X ve Y koordinatları ile genişlik ve yüksekliğinin 0 değerine sahip olup olmadığını belirler. |
| [get_Left](./get_left/)() const | Geçerli nesne tarafından temsil edilen dikdörtgenin sol kenarının X koordinatını döndürür. |
| [get_Location](./get_location/)() const | Geçerli nesne tarafından temsil edilen dikdörtgenin sol üst köşesinin konumunu belirten [PointF](../pointf/) sınıfının bir örneğini döndürür. |
| [get_Right](./get_right/)() const | Geçerli nesne tarafından temsil edilen dikdörtgenin sağ kenarının X koordinatını döndürür. |
| [get_Size](./get_size/)() const | Geçerli nesne tarafından temsil edilen dikdörtgenin genişlik ve yüksekliğini belirten [SizeF](../sizef/) sınıfının bir örneğini döndürür. |
| [get_Top](./get_top/)() const | Geçerli nesne tarafından temsil edilen dikdörtgenin üst kenarının Y koordinatını döndürür. |
| [get_Width](./get_width/)() const | Geçerli nesne tarafından temsil edilen dikdörtgenin genişliğini döndürür. |
| [get_X](./get_x/)() const | Geçerli nesne tarafından temsil edilen dikdörtgenin sol üst köşesinin X koordinatını döndürür. |
| [get_Y](./get_y/)() const | Geçerli nesne tarafından temsil edilen dikdörtgenin sol üst köşesinin Y koordinatını döndürür. |
| [GetHashCode](./gethashcode/)() const | Geçerli nesnenin bir karma kodunu döndürür. |
| [Inflate](./inflate/)(float, float) | Geçerli nesne tarafından temsil edilen dikdörtgenin genişlik ve yüksekliğini, dikdörtgenin geometrik merkezinin konumunu koruyarak artırır. Genişlik ve yükseklik, belirtilen miktarlar kadar her iki yönde artırılır. |
| [Inflate](./inflate/)(const SizeF\&) | Geçerli nesne tarafından temsil edilen dikdörtgenin genişlik ve yüksekliğini, dikdörtgenin geometrik merkezinin konumunu koruyarak artırır. Genişlik ve yükseklik, belirtilen boyut nesnesinin genişlik ve yükseklik değerleriyle belirlenen miktarlar kadar her iki yönde artırılır. |
| static [Inflate](./inflate/)(const RectangleF\&, float, float) | Belirtilen nesne tarafından temsil edilen dikdörtgenin genişlik ve yüksekliğini, dikdörtgenin geometrik merkezinin konumunu koruyarak artırır. Genişlik ve yükseklik, belirtilen miktarlar kadar her iki yönde artırılır. |
| [Intersect](./intersect/)(const RectangleF\&) | Geçerli nesne tarafından temsil edilen dikdörtgeni, belirtilen nesne tarafından temsil edilen dikdörtgenle kesişiminden elde edilen dikdörtgenle değiştirir. |
| static [Intersect](./intersect/)(const RectangleF\&, const RectangleF\&) | Belirtilen dikdörtgenlerin kesişiminin sonucu olan bir dikdörtgen döndürür. |
| [IntersectsWith](./intersectswith/)(const RectangleF\&) | Geçerli ve belirtilen nesneler tarafından temsil edilen dikdörtgenlerin kesişip kesişmediğini belirler. |
| [Offset](./offset/)(const PointF\&) | Geçerli nesne tarafından temsil edilen dikdörtgenin konumunu belirtilen miktarlar kadar kaydırır. |
| [Offset](./offset/)(float, float) | Geçerli nesne tarafından temsil edilen dikdörtgenin konumunu belirtilen miktarlar kadar kaydırır. |
| [operator!=](./operator!=/)(std::nullptr_t) const | Her zaman true döndürür. |
| [operator==](./operator==/)(std::nullptr_t) const | Her zaman false döndürür. |
| [RectangleF](./rectanglef/)() | X ve Y koordinatları ile genişlik ve yükseklik değerleri 0 olarak ayarlanmış bir dikdörtgeni temsil eden yeni bir [RectangleF](./) nesnesi oluşturur. |
| [RectangleF](./rectanglef/)(float, float, float, float) | Sol üst köşesinin belirtilen koordinatları ile genişlik ve yüksekliğe sahip bir dikdörtgeni temsil eden yeni bir [RectangleF](./) nesnesi oluşturur. |
| [RectangleF](./rectanglef/)(const PointF\&, const SizeF\&) | Yeni bir [RectangleF](./) nesnesi oluşturur; bu nesne, sol üst köşesinin koordinatları [PointF](../pointf/) sınıfının bir örneği olarak ve genişliği ile yüksekliği [SizeF](../sizef/) sınıfının bir örneği olarak belirtilen bir dikdörtgeni temsil eder. |
| explicit [RectangleF](./rectanglef/)(const Rectangle\&) | Belirtilen dikdörtgene eşdeğer olan bir dikdörtgeni temsil eden yeni bir [RectangleF](./) nesnesi oluşturur. |
| [set_Height](./set_height/)(float) | Geçerli nesne tarafından temsil edilen dikdörtgenin yüksekliğini ayarlar. |
| [set_Location](./set_location/)(PointF) | Geçerli nesne tarafından temsil edilen dikdörtgenin sol üst köşe konumunu ayarlar. |
| [set_Size](./set_size/)(SizeF) | Geçerli nesne tarafından temsil edilen dikdörtgenin genişliğini ve yüksekliğini ayarlar. |
| [set_Width](./set_width/)(float) | Geçerli nesne tarafından temsil edilen dikdörtgenin genişliğini ayarlar. |
| [set_X](./set_x/)(float) | Geçerli nesne tarafından temsil edilen dikdörtgenin sol üst köşesinin X koordinatını ayarlar. |
| [set_Y](./set_y/)(float) | Geçerli nesne tarafından temsil edilen dikdörtgenin sol üst köşesinin Y koordinatını ayarlar. |
| [ToString](./tostring/)() const | Geçerli nesnenin dize temsilini döndürür. |
| static [Union](./union/)(const RectangleF\&, const RectangleF\&) | Belirtilen dikdörtgenlerin birleşiminin sonucu olan bir dikdörtgen döndürür. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [Empty](./empty/) | Boş bir dikdörtgen, yani konum ve boyut değerleri sıfır olan bir dikdörtgen. |
## Ayrıca Bakınız

* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
