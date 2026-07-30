---
title: "System::Net::WebResponse sınıfı"
linktitle: "WebResponse"
second_title: "Aspose.Font için C++"
description: "System::Net::WebResponse sınıfı. Bir web yanıtını temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak tahsis edilmelidir. Yığın üzerinde veya new operatörüyle bu tipin örneğini oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirin."
type: docs
weight: 4000
url: /tr/cpp/system.net/webresponse/
---
## WebResponse class


Bir web yanıtını temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak tahsis edilmelidir. Yığın üzerinde veya new operatörüyle bu tipin örneğini oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class WebResponse : public System::IDisposable
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [Close](./close/)() | Yanıt akışını kapatır. |
| [Dispose](./dispose/)() override | Hiçbir şey yapmaz. |
| virtual [get_ContentLength](./get_contentlength/)() | RTTI bilgisi. |
| virtual [get_ContentType](./get_contenttype/)() | Kaynağın MIME tipini döndürür. |
| virtual [get_Headers](./get_headers/)() | Mevcut yanıtla ilişkili başlıkların koleksiyonunu döndürür. |
| virtual [get_ResponseUri](./get_responseuri/)() | Kaynağın URI'sını döndürür. |
| virtual [get_SupportsHeaders](./get_supportsheaders/)() | Mevcut yanıtın başlıkları destekleyip desteklemediğini gösteren bir değeri döndürür. |
| virtual [GetResponseStream](./getresponsestream/)() | Yanıt akışını döndürür. |
## Ayrıca Bakınız

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
