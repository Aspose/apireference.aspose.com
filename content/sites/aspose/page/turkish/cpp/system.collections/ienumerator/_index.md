---
title: "System::Collections::IEnumerator sınıfı"
linktitle: "IEnumerator"
second_title: "Aspose.Page için C++"
description: "System::Collections::IEnumerator sınıfı. Bazı öğeler üzerinde yineleme yapmak için kullanılabilen bir sayıcı arayüzü. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu türün örneğini yığına (stack) ya da new operatörüyle asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'da fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 600
url: /tr/cpp/system.collections/ienumerator/
---
## IEnumerator class


Enumerator arayüzü, bazı öğeler üzerinde yineleme yapmak için kullanılabilir. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türün örneğini yığına (stack) ya da new operatörüyle asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class IEnumerator : public virtual System::IDisposable,
                    public virtual System::Object
```


| Parameter | Açıklama |
| --- | --- |
| T | Öğe türü. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [Current](./current/)() const | Geçerli öğeyi alır. |
| virtual [get_Current](./get_current/)() const | Geçerli öğeyi alır. |
| virtual [MoveNext](./movenext/)() | Enumerator'ı bir sonraki öğeye taşır. Daha önce hiçbir öğe referans alınmamışsa, referansı mevcut ilk öğeye ayarlar. Eğer konteyner sonuna gelinmişse, hiçbir şey yapmaz. |
| virtual [Reset](./reset/)() | Sayacı ilk öğeden önceki konuma sıfırlar. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [ValueType](./valuetype/) | RTTI bilgisi. |

## Ayrıca Bakınız

* Class [IDisposable](../../system/idisposable/)
* Class [Object](../../system/object/)
* Namespace [System::Collections](../)
* Library [Aspose.Page for C++](../../)
