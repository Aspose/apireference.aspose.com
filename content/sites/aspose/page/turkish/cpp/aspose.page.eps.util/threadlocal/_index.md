---
title: "Aspose::Page::EPS::Util::ThreadLocal sınıfı"
linktitle: "ThreadLocal"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::EPS::Util::ThreadLocal sınıfı. .NET Framework 4.0 ve 4.5''s System.Threading.ThreadLocal sarmalayıcı tipinin sağladığı işlevselliği çoğaltmak için kullanılan sınıf. Bu, örnek ve statik tipleri uygular; bunlar iş parçacığı yerelidir ve iş parçacıkları arasında farklı örneklere başvurur, sınıfın birleştirildiği gerçek örnek tipi C++'ta aynı olsa bile."
type: docs
weight: 100
url: /tr/cpp/aspose.page.eps.util/threadlocal/
---
## ThreadLocal class


.NET Framework 4.0 ve 4.5'in System.Threading.ThreadLocal sarmalayıcı tipinin işlevselliğini çoğaltmak için kullanılan sınıf. Bu sınıf, iş parçacığına özgü olan ve iş parçacıkları arasında farklı örneklere referans veren örnek ve statik tipleri uygular, ancak sınıfın bir araya getirildiği gerçek örnek tipi aynı olabilir.

```cpp
template<typename T>class ThreadLocal : public System::IDisposable
```


| Parameter | Açıklama |
| --- | --- |
| T | İş parçacığı seçim mantığında sarmalanacak değişken türü |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Dispose](./dispose/)() override | Hiçbir şey yapmaz. |
| [get_Value](./get_value/)() |  |
| [isValueCreated](./isvaluecreated/)() |  |
| [set_Value](./set_value/)(T) |  |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | n'inci şablon argümanını zayıf bir işaretçi olarak ayarla (paylaşılan yerine). Kapsayıcılardaki işaretçilerin zayıf moda geçişine izin verir. |
| [ThreadLocal](./threadlocal/)(Factory) |  |
| static [to_T](./to_t/)(System::SharedPtr\<ThreadLocal\<T\>\>) |  |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Factory](./factory/) |  |

## Ayrıca Bakınız

* Class [IDisposable](../../system/idisposable/)
* Namespace [Aspose::Page::EPS::Util](../)
* Library [Aspose.Page for C++](../../)
