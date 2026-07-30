---
title: "System::Drawing::Rectangle sınıfı"
linktitle: "Dikdörtgen"
second_title: "Aspose.Font için C++"
description: "System::Drawing::Rectangle sınıfı. Bir görüntünün sol üst köşesinin tam sayı X ve Y koordinatları ile genişlik ve yüksekliği olarak tanımlanan dikdörtgen bir alanı temsil eder. Bu tür, yığına (stack) tahsis edilmeli ve fonksiyonlara değer olarak ya da referansla geçirilmelidir. C++'ta bu türün nesnelerini yönetmek için System::SmartPtr sınıfını asla kullanmayın."
type: docs
weight: 1900
url: /tr/cpp/system.drawing/rectangle/
---
## Rectangle class


Bir görüntünün sol üst köşesinin tam sayı X ve Y koordinatları ile genişlik ve yüksekliği olarak tanımlanan dikdörtgen bir alanı temsil eder. Bu tür, yığına tahsis edilmeli ve fonksiyonlara değer olarak ya da referansla geçirilmelidir. Bu türün nesnelerini yönetmek için [System::SmartPtr](../../system/smartptr/) sınıfını asla kullanmayın.

```cpp
class Rectangle
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| static [Ceiling](./ceiling/)(const RectangleF\&) | Belirtilen [RectangleF](../rectanglef/) nesnesinin konum ve boyut değerlerini bir üst tam sayıya yuvarlayarak bir [Rectangle](./) nesnesi oluşturur. |
| [Contains](./contains/)(int, int) const | Belirtilen noktanın geçerli nesne tarafından temsil edilen dikdörtgenin içinde olup olmadığını belirler. |
| [Contains](./contains/)(const Point\&) const | Belirtilen noktanın geçerli nesne tarafından temsil edilen dikdörtgenin içinde olup olmadığını belirler. |
| [Contains](./contains/)(const Rectangle\&) const | Belirtilen dikdörtgenin, geçerli nesne tarafından temsil edilen dikdörtgenin içinde olup olmadığını belirler. |
| [Equals](./equals/)(const Rectangle\&) const | Geçerli ve belirtilen nesneler tarafından temsil edilen dikdörtgenlerin aynı olup olmadığını belirler. |
| static [FromLTRB](./fromltrb/)(int, int, int, int) | Belirtilen kenar konumlarıyla bir dikdörtgeni temsil eden yeni bir [Rectangle](./) nesnesi oluşturur. |
| [get_Bottom](./get_bottom/)() const | Geçerli nesne tarafından temsil edilen dikdörtgenin alt kenarının y koordinatını döndürür. |
| [get_Height](./get_height/)() const | Geçerli nesne tarafından temsil edilen dikdörtgenin yüksekliğini döndürür. |
| [get_IsEmpty](./get_isempty/)() const | Geçerli nesne tarafından temsil edilen dikdörtgenin sol üst köşesinin X ve Y koordinatlarının ve genişlik ile yüksekliğinin 0 değerine sahip olup olmadığını belirler. |
| [get_Left](./get_left/)() const | Geçerli nesne tarafından temsil edilen dikdörtgenin sol kenarının X koordinatını döndürür. |
| [get_Location](./get_location/)() const | Geçerli nesne tarafından temsil edilen dikdörtgenin sol üst köşesinin konumunu belirten [Point](../point/) sınıfının bir örneğini döndürür. |
| [get_Right](./get_right/)() const | Geçerli nesne tarafından temsil edilen dikdörtgenin sağ kenarının X koordinatını döndürür. |
| [get_Size](./get_size/)() const | Geçerli nesne tarafından temsil edilen dikdörtgenin genişlik ve yüksekliğini belirten [Size](../size/) sınıfının bir örneğini döndürür. |
| [get_Top](./get_top/)() const | Geçerli nesne tarafından temsil edilen dikdörtgenin üst kenarının Y koordinatını döndürür. |
| [get_Width](./get_width/)() const | Geçerli nesne tarafından temsil edilen dikdörtgenin genişliğini döndürür. |
| [get_X](./get_x/)() const | Geçerli nesne tarafından temsil edilen dikdörtgenin sol üst köşesinin X koordinatını döndürür. |
| [get_Y](./get_y/)() const | Geçerli nesne tarafından temsil edilen dikdörtgenin sol üst köşesinin Y koordinatını döndürür. |
| [GetHashCode](./gethashcode/)() const | Geçerli nesnenin bir hash kodunu döndürür. |
| [Inflate](./inflate/)(int, int) | Geçerli nesne tarafından temsil edilen dikdörtgenin genişlik ve yüksekliğini, dikdörtgenin geometrik merkezinin konumunu koruyarak artırır. Genişlik ve yükseklik, belirtilen miktarlar kadar her iki yönde artırılır. |
| [Inflate](./inflate/)(const Size\&) | Geçerli nesne tarafından temsil edilen dikdörtgenin genişlik ve yüksekliğini, dikdörtgenin geometrik merkezinin konumunu koruyarak artırır. Genişlik ve yükseklik, belirtilen boyut nesnesinin genişlik ve yükseklik değerleriyle eşleşen miktarlar kadar her iki yönde artırılır. |
| static [Inflate](./inflate/)(const Rectangle\&, int, int) | Belirtilen nesne tarafından temsil edilen dikdörtgenin genişlik ve yüksekliğini, dikdörtgenin geometrik merkezinin konumunu koruyarak artırır. Genişlik ve yükseklik, belirtilen miktarlar kadar her iki yönde artırılır. |
| [Intersect](./intersect/)(const Rectangle\&) | Geçerli nesne tarafından temsil edilen dikdörtgeni, belirtilen nesne tarafından temsil edilen dikdörtgenle kesişiminden elde edilen dikdörtgenle değiştirir. |
| static [Intersect](./intersect/)(const Rectangle\&, const Rectangle\&) | Belirtilen dikdörtgenlerin kesişiminin sonucu olan bir dikdörtgen döndürür. |
| [IntersectsWith](./intersectswith/)(const Rectangle\&) | Geçerli ve belirtilen nesneler tarafından temsil edilen dikdörtgenlerin kesişip kesişmediğini belirler. |
| [Offset](./offset/)(const Point\&) | Geçerli nesne tarafından temsil edilen dikdörtgenin konumunu, belirtilen miktarlar kadar kaydırır. |
| [Offset](./offset/)(int, int) | Geçerli nesne tarafından temsil edilen dikdörtgenin konumunu, belirtilen miktarlar kadar kaydırır. |
| [operator RectangleF](./operatorrectanglef/)() const | Geçerli nesne tarafından temsil edilen dikdörtgenle eşdeğer bir dikdörtgeni temsil eden bir [RectangleF](../rectanglef/) nesnesi döndürür. |
| [operator!=](./operator!=/)(std::nullptr_t) const | Her zaman true döndürür. |
| [operator==](./operator==/)(std::nullptr_t) const | Her zaman false döndürür. |
| [Rectangle](./rectangle/)() | X ve Y koordinatları ile genişlik ve yükseklik değerleri 0 olarak ayarlanmış bir dikdörtgeni temsil eden yeni bir [Rectangle](./) nesnesi oluşturur. |
| [Rectangle](./rectangle/)(int, int, int, int) | Sol üst köşesinin belirtilen koordinatları ile genişlik ve yüksekliği olan bir dikdörtgeni temsil eden yeni bir [Rectangle](./) nesnesi oluşturur. |
| [Rectangle](./rectangle/)(const Point\&, const Size\&) | Sol üst köşesinin koordinatları bir [Point](../point/) sınıfı örneği olarak, genişlik ve yüksekliği ise bir [Size](../size/) sınıfı örneği olarak belirtilen bir dikdörtgeni temsil eden yeni bir [Rectangle](./) nesnesi oluşturur. |
| [Rectangle](./rectangle/)(const System::Windows::Forms::Screen::Rectangle_\&) | Belirtilen dikdörtgene eşdeğer bir dikdörtgeni temsil eden yeni bir [Rectangle](./) nesnesi oluşturur. |
| static [Round](./round/)(const RectangleF\&) | Belirtilen [RectangleF](../rectanglef/) nesnesinin konum ve boyut değerlerini en yakın tam sayıya yuvarlayarak bir [Rectangle](./) nesnesi oluşturur. |
| [set_Height](./set_height/)(int) | Geçerli nesne tarafından temsil edilen dikdörtgenin yüksekliğini ayarlar. |
| [set_Location](./set_location/)(Point) | Geçerli nesne tarafından temsil edilen dikdörtgenin sol üst köşesinin konumunu ayarlar. |
| [set_Size](./set_size/)(Size) | Geçerli nesne tarafından temsil edilen dikdörtgenin genişliğini ve yüksekliğini ayarlar. |
| [set_Width](./set_width/)(int) | Geçerli nesne tarafından temsil edilen dikdörtgenin genişliğini ayarlar. |
| [set_X](./set_x/)(int) | Geçerli nesne tarafından temsil edilen dikdörtgenin sol üst köşesinin X koordinatını ayarlar. |
| [set_Y](./set_y/)(int) | Geçerli nesne tarafından temsil edilen dikdörtgenin sol üst köşesinin Y koordinatını ayarlar. |
| [ToString](./tostring/)() const | Geçerli nesnenin string temsilini döndürür. |
| static [Truncate](./truncate/)(const RectangleF\&) | Belirtilen [RectangleF](../rectanglef/) nesnesinin konum ve boyut değerlerini bir alt tam sayıya kırparak bir [Rectangle](./) nesnesi oluşturur. |
| static [Union](./union/)(const Rectangle\&, const Rectangle\&) | Belirtilen dikdörtgenlerin birleşimi sonucu oluşan bir dikdörtgen döndürür. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [Empty](./empty/) | Boş bir dikdörtgen, yani konum ve boyut değerleri sıfır olan bir dikdörtgen. |
## Ayrıca Bakınız

* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
