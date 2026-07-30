---
title: "System::Diagnostics::TraceListener class"
linktitle: "TraceListener"
second_title: "Aspose.Font için C++"
description: "System::Diagnostics::TraceListener sınıfı. Hata ayıklama ve izleme bilgilerine yanıt vermek için bir arayüz. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığıt üzerinde veya operator new kullanarak oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'de fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 800
url: /tr/cpp/system.diagnostics/tracelistener/
---
## TraceListener class


Hata ayıklama ve izleme bilgilerine yanıt vermek için bir arayüz. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığıt üzerinde veya operator new kullanarak oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class TraceListener : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [Fail](./fail/)(System::String) | Hata ayıklayıcıya başarısızlık mesajı yazar. |
| virtual [Fail](./fail/)(System::String, System::String) | Hata ayıklayıcıya başarısızlık mesajı yazar. |
| virtual [Write](./write/)(System::String) | RTTI bilgisi. |
| virtual [WriteLine](./writeline/)(System::String) | Hata ayıklayıcıya satır yazar. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Font for C++](../../)
