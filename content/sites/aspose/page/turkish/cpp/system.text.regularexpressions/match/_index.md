---
title: "System::Text::RegularExpressions::Match sınıfı"
linktitle: "Match"
second_title: "Aspose.Page için C++"
description: "System::Text::RegularExpressions::Match sınıfı. Dize üzerindeki regexp'in tek bir eşleşmesi. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirin."
type: docs
weight: 600
url: /tr/cpp/system.text.regularexpressions/match/
---
## Match class


[Single](../../system/single/) match of regexp over string. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Match : public System::Text::RegularExpressions::Group
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [AddCapture](./addcapture/)(const CapturePtr\&) | Yakalamayı eşleşmeye ekler. |
| [AddGroup](./addgroup/)(const GroupPtr\&) | Grubu eşleşmeye ekler. |
| static [get_Empty](./get_empty/)() | Boş eşleşme erişimcisi. |
| [get_Groups](./get_groups/)() | Grup listesini alır. |
| [Match](./match/)(const UStringPtr\&, int, int) | Yapıcı. |
| [NextMatch](./nextmatch/)() | Eşleşmeler üzerinde yineleme. |
| virtual [Result](./result/)(const String\&) | Alt eşleşme referanslarını değerleriyle değiştirerek dizeyi biçimlendirir. |
| [SetMappedIndexes](./setmappedindexes/)(const std::vector\<int\>\&) |  |
## Ayrıca Bakınız

* Class [Group](../group/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Page for C++](../../)
