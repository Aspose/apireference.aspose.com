---
title: "System::Drawing::Region class"
linktitle: "Region"
second_title: "Aspose.Font için C++"
description: "System::Drawing::Region class. Grafik şeklinin iç kısmını temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++ içinde fonksiyonlara argüman olarak geçirin."
type: docs
weight: 2100
url: /tr/cpp/system.drawing/region/
---
## Region class


Grafik şeklinin iç kısmını temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class Region : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Clone](./clone/)() const | Geçerli nesnenin bir kopyasını döndürür. |
| [Complement](./complement/)(const RectangleF\&) | Geçerli nesne tarafından temsil edilen bölgeyi, belirtilen dikdörtgen tarafından tanımlanan ve bu bölgeyle kesişmeyen bölge kısmıyla değiştirir. |
| [Complement](./complement/)(const Rectangle\&) | Geçerli nesne tarafından temsil edilen bölgeyi, belirtilen dikdörtgen tarafından tanımlanan ve bu bölgeyle kesişmeyen bölge kısmıyla değiştirir. |
| [Complement](./complement/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | Geçerli nesne tarafından temsil edilen bölgeyi, belirtilen yol tarafından tanımlanan ve bu bölgeyle kesişmeyen bölge kısmıyla değiştirir. |
| [Complement](./complement/)(const SharedPtr\<Region\>\&) | Geçerli nesne tarafından temsil edilen bölgeyi, belirtilen bölgenin bu bölgeyle kesişmeyen kısmıyla değiştirir. |
| [Dispose](./dispose/)() | Geçerli nesne tarafından edinilen tüm işletim sistemi kaynaklarını serbest bırakır. |
| [Equals](./equals/)(const SharedPtr\<Region\>\&, const SharedPtr\<Graphics\>\&) | Belirtilen bölgenin, belirtilen çizim yüzeyinde geçerli nesne tarafından temsil edilen bölgeyle aynı olup olmadığını belirler. |
| [Exclude](./exclude/)(const RectangleF\&) | Geçerli nesne tarafından temsil edilen bölgeyi, belirtilen dikdörtgen tarafından tanımlanan bölgenin dışlanması sonucuyla değiştirir. |
| [Exclude](./exclude/)(const Rectangle\&) | Geçerli nesne tarafından temsil edilen bölgeyi, belirtilen dikdörtgen tarafından tanımlanan bölgenin dışlanması sonucuyla değiştirir. |
| [Exclude](./exclude/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | Geçerli nesne tarafından temsil edilen bölgeyi, belirtilen yol tarafından tanımlanan bölgenin dışlanması sonucuyla değiştirir. |
| [Exclude](./exclude/)(const SharedPtr\<Region\>\&) | Geçerli nesne tarafından temsil edilen bölgeyi, belirtilen bölgenin dışlanması sonucuyla değiştirir. |
| [GetBounds](./getbounds/)(const SharedPtr\<Graphics\>\&) const | Bir [RectangleF](../rectanglef/) yapısı alır; bu yapı, bir [Graphics](../graphics/) nesnesinin çizim yüzeyinde bu [Region](./) nesnesini sınırlayan dikdörtgeni temsil eder. |
| [GetRegionData](./getregiondata/)() const | Geçerli nesne tarafından temsil edilen bölgeyi tanımlayan verileri içeren bir RegionData nesnesi döndürür. |
| [GetRegionScans](./getregionscans/)(const SharedPtr\<Drawing2D::Matrix\>\&) const | Belirtilen matris dönüşümü uygulandıktan sonra bu [Region](./) nesnesini yaklaşık olarak temsil eden bir dizi [RectangleF](../rectanglef/) yapısı döndürür. |
| [Intersect](./intersect/)(const RectangleF\&) | Geçerli nesne tarafından temsil edilen bölgeyi, bu bölge ile belirtilen dikdörtgen tarafından tanımlanan bir bölgenin kesişimi sonucuyla değiştirir. |
| [Intersect](./intersect/)(const Rectangle\&) | Geçerli nesne tarafından temsil edilen bölgeyi, bu bölge ile belirtilen dikdörtgen tarafından tanımlanan bir bölgenin kesişimi sonucuyla değiştirir. |
| [Intersect](./intersect/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | Geçerli nesne tarafından temsil edilen bölgeyi, bu bölge ile belirtilen yol tarafından tanımlanan bir bölgenin kesişim sonucuyla değiştirir. |
| [Intersect](./intersect/)(const SharedPtr\<Region\>\&) | Geçerli nesne tarafından temsil edilen bölgeyi, bu bölge ile belirtilen bölgenin kesişim sonucuyla değiştirir. |
| [IsEmpty](./isempty/)(const SharedPtr\<Graphics\>\&) const | Geçerli nesne tarafından temsil edilen bölgenin, belirtilen çizim yüzeyinde boş iç mekâna sahip olup olmadığını belirler. |
| [IsInfinite](./isinfinite/)(const SharedPtr\<Graphics\>\&) const | Geçerli nesne tarafından temsil edilen bölgenin, belirtilen çizim yüzeyinde sonsuz iç mekâna sahip olup olmadığını belirler. |
| [IsVisible](./isvisible/)(const Point\&) const | Belirtilen noktanın, geçerli nesne tarafından temsil edilen bölge içinde bulunup bulunmadığını belirler. |
| [IsVisible](./isvisible/)(const PointF\&) const | Belirtilen noktanın, geçerli nesne tarafından temsil edilen bölge içinde bulunup bulunmadığını belirler. |
| [IsVisible](./isvisible/)(const Rectangle\&) | Belirtilen dikdörtgenin herhangi bir kısmının, geçerli nesne tarafından temsil edilen bölge içinde bulunup bulunmadığını belirler. |
| [IsVisible](./isvisible/)(const RectangleF\&) | Belirtilen dikdörtgenin herhangi bir kısmının, geçerli nesne tarafından temsil edilen bölge içinde bulunup bulunmadığını belirler. |
| [IsVisible](./isvisible/)(const Point\&, const SharedPtr\<Graphics\>\&) const | Belirtilen grafikleri kullanarak, belirtilen noktanın geçerli nesne tarafından temsil edilen bölge içinde bulunup bulunmadığını belirler. |
| [IsVisible](./isvisible/)(const PointF\&, const SharedPtr\<Graphics\>\&) const | Belirtilen grafikleri kullanarak, belirtilen noktanın geçerli nesne tarafından temsil edilen bölge içinde bulunup bulunmadığını belirler. |
| [IsVisible](./isvisible/)(const Rectangle\&, const SharedPtr\<Graphics\>\&) | Belirtilen grafikleri kullanarak, belirtilen dikdörtgenin herhangi bir kısmının geçerli nesne tarafından temsil edilen bölge içinde bulunup bulunmadığını belirler. |
| [IsVisible](./isvisible/)(const RectangleF\&, const SharedPtr\<Graphics\>\&) | Belirtilen grafikleri kullanarak, belirtilen dikdörtgenin herhangi bir kısmının geçerli nesne tarafından temsil edilen bölge içinde bulunup bulunmadığını belirler. |
| [IsVisible](./isvisible/)(float, float) const | Belirtilen noktanın, geçerli nesne tarafından temsil edilen bölge içinde bulunup bulunmadığını belirler. |
| [IsVisible](./isvisible/)(float, float, const SharedPtr\<Graphics\>\&) const | Belirtilen grafikleri kullanarak, belirtilen noktanın geçerli nesne tarafından temsil edilen bölge içinde bulunup bulunmadığını belirler. |
| [MakeEmpty](./makeempty/)() | Geçerli nesneyi boş iç mekâna başlatır. |
| [MakeInfinite](./makeinfinite/)() | Bu bölge nesnesini sonsuz iç mekâna başlatır. |
| [Region](./region/)() | [Region](./) sınıfının yeni bir örneğini oluşturur. |
| [Region](./region/)(const RectangleF\&) | Belirtilen dikdörtgen tarafından tanımlanan bir bölgeyi temsil eden [Region](./) sınıfının yeni bir örneğini oluşturur. |
| [Region](./region/)(const Rectangle\&) | Belirtilen dikdörtgen tarafından tanımlanan bir bölgeyi temsil eden [Region](./) sınıfının yeni bir örneğini oluşturur. |
| [Region](./region/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | Belirtilen yol tarafından tanımlanan bir bölgeyi temsil eden [Region](./) sınıfının yeni bir örneğini oluşturur. |
| [Region](./region/)(const SkPath\&) |  |
| [Region](./region/)(const SharedPtr\<Drawing2D::RegionData\>\&) | Belirtilen RegionData nesnesi tarafından tanımlanan bir bölgeyi temsil eden [Region](./) sınıfının yeni bir örneğini oluşturur. |
| [Transform](./transform/)(const SharedPtr\<Drawing2D::Matrix\>\&) | Bu bölgeyi belirtilen matris ile dönüştürür. |
| [Transform](./transform/)(const SkMatrix\&) | Bu bölgeyi belirtilen matris ile dönüştürür. |
| [Translate](./translate/)(int, int) | Bölgenin koordinatlarını belirtilen miktarda kaydırır. |
| [Translate](./translate/)(float, float) | Bölgenin koordinatlarını belirtilen miktarda kaydırır. |
| [Union](./union/)(const RectangleF\&) | Geçerli nesne tarafından temsil edilen bölgeyi, bu bölge ile belirtilen dikdörtgen tarafından tanımlanan bir bölgenin birleşim işlemi sonucuyla değiştirir. |
| [Union](./union/)(const Rectangle\&) | Geçerli nesne tarafından temsil edilen bölgeyi, bu bölge ile belirtilen dikdörtgen tarafından tanımlanan bir bölgenin birleşim sonucuyla değiştirir. |
| [Union](./union/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | Geçerli nesne tarafından temsil edilen bölgeyi, bu bölge ile belirtilen yol tarafından tanımlanan bir bölgenin birleşim sonucuyla değiştirir. |
| [Union](./union/)(const SharedPtr\<Region\>\&) | Geçerli nesne tarafından temsil edilen bölgeyi, bu bölge ile belirtilen bölgenin birleşim sonucuyla değiştirir. |
| [Xor](./xor/)(const RectangleF\&) | Geçerli nesne tarafından temsil edilen bölgeyi, bu bölge ile belirtilen dikdörtgen tarafından tanımlanan bölgenin kesişmeyen kısımlarıyla değiştirir. |
| [Xor](./xor/)(const Rectangle\&) | Geçerli nesne tarafından temsil edilen bölgeyi, bu bölge ile belirtilen dikdörtgen tarafından tanımlanan bölgenin kesişmeyen kısımlarıyla değiştirir. |
| [Xor](./xor/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | Geçerli nesne tarafından temsil edilen bölgeyi, bu bölge ile belirtilen yol tarafından tanımlanan bölgenin kesişmeyen kısımlarıyla değiştirir. |
| [Xor](./xor/)(const SharedPtr\<Region\>\&) | Geçerli nesne tarafından temsil edilen bölgeyi, bu bölge ile belirtilen bölgenin kesişmeyen kısımlarıyla değiştirir. |
| virtual [~Region](./~region/)() | Yıkıcı. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
