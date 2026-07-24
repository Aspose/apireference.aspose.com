---
title: "System::IO::StreamWriter sınıfı"
linktitle: "StreamWriter"
second_title: "Aspose.Page için C++"
description: "System::IO::StreamWriter sınıfı. Karakterleri bir bayt akışına yazan bir yazar temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak allocate (ayrılmalıdır). Bu tipin örneğini yığına (stack) veya operator new kullanarak oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 2300
url: /tr/cpp/system.io/streamwriter/
---
## StreamWriter class


Karakterleri bir bayt akışına yazan bir yazar temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak allocate (ayrılmalıdır). Bu tipin örneğini yığına (stack) veya operator new kullanarak oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class StreamWriter : public System::IO::TextWriter
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Close](./close/)() override | Akışı kapatır ve edinilen kaynakları serbest bırakır. |
| [Dispose](./dispose/)() override | Geçerli nesne tarafından kullanılan tüm kaynakları serbest bırakır ve temel akışı kapatır. |
| [Flush](./flush/)() override | Arabellek içeriğini temel akışa boşaltır ve ardından temel akışı boşaltır. |
| [get_AutoFlush](./get_autoflush/)() const | [StreamWriter](./) nesnesinin, [StreamWriter::Write](./write/) yöntemi her çağrıldığında verileri temel akışa boşaltıp boşaltmayacağını gösteren bir değer döndürür. |
| [get_BaseStream](./get_basestream/)() const | Temel akışı temsil eden bir nesneye ortak işaretçi döndürür. |
| [get_Encoding](./get_encoding/)() override | Şu anda kullanılan kodlamayı döndürür. |
| [set_AutoFlush](./set_autoflush/)(bool) | [StreamWriter](./) nesnesinin, [StreamWriter::Write](./write/) yöntemi her çağrıldığında verileri temel akışa boşaltıp boşaltmayacağını belirten bir değer döndürür. |
| [StreamWriter](./streamwriter/)(const SharedPtr\<Stream\>\&) | UTF-8 kodlamasını ve varsayılan 1024 bayt boyutundaki bir arabellegi kullanarak belirtilen temel akışa karakter yazan bir [StreamWriter](./) nesnesi örneği oluşturur. |
| [StreamWriter](./streamwriter/)(const SharedPtr\<Stream\>\&, const EncodingPtr\&) | Belirtilen kodlamayı ve varsayılan 1024 bayt boyutundaki bir arabellegi kullanarak belirtilen temel akışa karakter yazan bir [StreamWriter](./) nesnesi örneği oluşturur. |
| [StreamWriter](./streamwriter/)(const SharedPtr\<Stream\>\&, const EncodingPtr\&, int, bool) | Belirtilen kodlamayı ve belirtilen boyuttaki bir arabellegi kullanarak belirtilen temel akışa karakter yazan bir [StreamWriter](./) nesnesi örneği oluşturur. Bir parametre, [StreamWriter](./) nesnesi elden çıkarıldığında temel akışın kapatılıp kapatılmayacağını belirler. |
| [StreamWriter](./streamwriter/)(const String\&) | UTF-8 kodlamasını ve varsayılan 1024 bayt boyutundaki bir arabellegi kullanarak belirtilen dosyaya karakter yazan bir [StreamWriter](./) nesnesi örneği oluşturur. |
| [StreamWriter](./streamwriter/)(const String\&, bool, const EncodingPtr\&) | Belirtilen kodlamayı ve varsayılan 1024 bayt boyutundaki bir arabellegi kullanarak belirtilen dosyaya karakter yazan bir [StreamWriter](./) nesnesi örneği oluşturur. Bir parametre, verilerin dosyaya eklenip eklenmeyeceğini veya dosyanın üzerine yazılıp yazılmayacağını belirler. |
| [StreamWriter](./streamwriter/)(const String\&, bool, const EncodingPtr\&, int) | Belirtilen kodlamayı ve belirtilen arabellek boyutunu kullanarak belirtilen dosyaya karakter yazan bir [StreamWriter](./) nesnesi örneği oluşturur. Bir parametre, verilerin dosyaya eklenip eklenmeyeceğini veya dosyanın üzerine yazılıp yazılmayacağını belirler. |
| [Write](./write/)(char_t) override | Belirtilen karakteri akışa yazar. |
| [Write](./write/)(const String\&) override | Belirtilen dizeyi akışa yazar. |
| [Write](./write/)(const SharedPtr\<Object\>\&) override | Belirtilen nesnenin dize temsilini akışa yazar. |
| [Write](./write/)(const ArrayPtr\<char_t\>\&) override | Belirtilen diziden tüm karakterleri akışa yazar. |
| [Write](./write/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) override | Belirtilen karakter dizisinden belirtilen UTF-16 karakter alt aralığını akışa yazar. |
| [Write](./write/)(const char_t *) override | Belirtilen c-dizesini akışa yazar. |
| [Write](./write/)(const System::SharedPtr\<T\>\&) | Belirtilen nesnenin dize temsilini akışa yazar. |
| [WriteLine](./writeline/)() override | Satır sonlandırıcı karakterlerini akışa yazar. |
| [WriteLine](./writeline/)(const String\&) override | Belirtilen dizeyi, satır sonlandırma karakterlerinden sonra akışa yazar. |
| [WriteLine](./writeline/)(const SharedPtr\<Object\>\&) override | Belirtilen nesnenin dize temsilini, ardından satır sonlandırıcı karakterleriyle birlikte akışa yazar. |
| [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&) override | Belirtilen diziden tüm karakterleri, satır sonlandırma karakterlerinden sonra akışa yazar. |
| [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) override | Belirtilen karakter dizisinden UTF-16 karakterlerinin belirtilen alt aralığını, satır sonlandırma karakterlerinden sonra akışa yazar. |
| [WriteLine](./writeline/)(const char_t *) override | Belirtilen C-dizisini, satır sonlandırma karakterlerinden sonra akışa yazar. |
| [WriteLine](./writeline/)(const System::SharedPtr\<T\>\&) | Belirtilen nesnenin dize temsilini, ardından satır sonlandırıcı karakterleriyle birlikte akışa yazar. |
| [~StreamWriter](./~streamwriter/)() | Yıkıcı. |
## Ayrıca Bakınız

* Class [TextWriter](../textwriter/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
