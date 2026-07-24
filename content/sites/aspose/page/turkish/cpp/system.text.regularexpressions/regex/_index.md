---
title: "System::Text::RegularExpressions::Regex sınıfı"
linktitle: "Regex"
second_title: "Aspose.Page için C++"
description: "System::Text::RegularExpressions::Regex sınıfı. C# benzeri sözdizimini izleyen düzenli ifade. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek hiçbir zaman yığına (stack) veya new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 800
url: /tr/cpp/system.text.regularexpressions/regex/
---
## Regex class


C# benzeri sözdizimini izleyen düzenli ifade. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek hiçbir zaman yığına (stack) veya new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class Regex : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| static [Escape](./escape/)(const String\&) | Deseni bir parçası olarak dizeyi kullanmak için özel karakterleri kaçırır. |
| [get_MatchTimeout](./get_matchtimeout/)() | Eşleşme zaman aşımını alır. |
| [get_Options](./get_options/)() | Regex seçeneklerini alır. |
| [get_RightToLeft](./get_righttoleft/)() | Eşleşmenin sağdan sola modda yapılıp yapılmadığını kontrol eder. |
| [IsMatch](./ismatch/)(const String\&, int) | Regex'i dizeye karşı eşleştirir. |
| static [IsMatch](./ismatch/)(const String\&, const String\&, RegexOptions, TimeSpan, int) | Dizenin desene uyup uymadığını kontrol eder. |
| [Match](./match/)(const String\&) | Regex'i dizeye karşı eşleştirir. |
| [Match](./match/)(const String\&, int, int) | Regex'i dizeye karşı eşleştirir. |
| static [Match](./match/)(const String\&, const String\&, RegexOptions, TimeSpan, int, int) | Dizeyi ve deseni eşleştirir. |
| [Matches](./matches/)(const String\&, int) | Verilen dizede regex'in tüm eşleşmelerini tekrar tekrar eşleştirerek alır. |
| static [Matches](./matches/)(const String\&, const String\&, RegexOptions, TimeSpan, int, int) | Dize ve desen arasındaki tüm eşleşmeleri alır. |
| [Regex](./regex/)() | Boş bir düzenli ifade oluşturur. |
| [Regex](./regex/)(const String\&) | Yapıcı. |
| [Regex](./regex/)(const String\&, RegexOptions) | Yapıcı. |
| [Regex](./regex/)(const String\&, RegexOptions, TimeSpan) | Yapıcı. |
| [Replace](./replace/)(const String\&, const String\&) | Dizedeki regex'in tüm eşleşmelerini yerine koyma dizesiyle değiştirir. |
| [Replace](./replace/)(const String\&, const char_t *) | Dizedeki regex'in tüm eşleşmelerini yerine koyma dizesiyle değiştirir. |
| static [Replace](./replace/)(const String\&, const char_t *, const char_t *) | Dizedeki regex'in tüm eşleşmelerini yerine koyma dizesiyle değiştirir. |
| static [Replace](./replace/)(const String\&, const String\&, const char_t *) | Dizedeki regex'in tüm eşleşmelerini yerine koyma dizesiyle değiştirir. |
| [Replace](./replace/)(const String\&, const MatchEvaluator\&) | Dizedeki tüm eşleşmeleri temsilci tarafından oluşturulan yerine koyma dizeleriyle değiştirir. |
| [Replace](./replace/)(const String\&, const MatchEvaluator\&, int) | Dizedeki tüm eşleşmeleri temsilci tarafından oluşturulan yerine koyma dizeleriyle değiştirir. |
| [Replace](./replace/)(const String\&, const MatchEvaluator\&, int, int) | Dizedeki tüm eşleşmeleri temsilci tarafından oluşturulan yerine koyma dizeleriyle değiştirir. |
| static [Replace](./replace/)(const String\&, const String\&, const MatchEvaluator\&, RegexOptions) | Dizedeki tüm eşleşmeleri temsilci tarafından oluşturulan yerine koyma dizeleriyle değiştirir (statik işlev). |
| static [Replace](./replace/)(const String\&, const String\&, const String\&, RegexOptions) | Dizedeki regex'in tüm eşleşmelerini yerine koyma dizesiyle değiştirir. |
| [Replace](./replace/)(const String\&, const String\&, int) | Dizedeki alt dizeleri değiştirir. Henüz uygulanmadı. |
| [Replace](./replace/)(const String\&, const String\&, int, int) | Dizedeki alt dizeleri değiştirir. Henüz uygulanmadı. |
| static [Replace](./replace/)(const String\&, const String\&, const String\&) | Düzenli ifade eşleşmelerini değiştirir. |
| static [Replace](./replace/)(const String\&, const String\&, const MatchEvaluator\&) | Düzenli ifade eşleşmelerini değiştirir. |
| [Split](./split/)(const String\&) | Dizeyi düzenli ifade eşleşmelerine göre böler. |
| [Split](./split/)(const String\&, int) | Dizeyi düzenli ifade eşleşmelerine göre böler. |
| [Split](./split/)(const String\&, int, int) | Girdi dizesini, [Regex](./) yapıcısında belirtilen bir düzenli ifadeyle tanımlanan konumlardaki, belirtilen azami sayıda kez, alt dize dizisine böler. Düzenli ifade deseninin aranması, girdi dizesindeki belirtilen karakter konumundan başlar. |
| static [Split](./split/)(const String\&, const String\&, RegexOptions, TimeSpan) | Dizeyi regexp'e göre böler. |
| static [Split](./split/)(const String\&, const String\&, int, RegexOptions, TimeSpan) | Dizeyi regexp'e göre böler. |
| [ToString](./tostring/)() const override | Düzenli ifadeyi dizeye dönüştürür. |
| static [Unescape](./unescape/)(const String\&) | Desenin bir parçası olarak kullanılan dizedeki özel karakterlerin kaçışını kaldırır. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [InfiniteMatchTimeout](./infinitematchtimeout/) | Eşleşmenin zaman aşımıyla kesilmesini devre dışı bırakmak için özel zaman aşımı değeri. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Page for C++](../../)
