---
title: "System::IO::StreamWriter sınıfı"
linktitle: "StreamWriter"
second_title: "Aspose.Font için C++"
description: "System::IO::StreamWriter sınıfı. Karakterleri bir bayt akışına yazan bir yazar temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Yığını (stack) üzerinde veya new operatörüyle bu tipin örneğini oluşturmayın; bu, çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 2300
url: /tr/cpp/system.io/streamwriter/
---
## StreamWriter class


Karakterleri bir bayt akışına yazan bir yazar temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Yığını (stack) üzerinde veya new operatörüyle bu tipin örneğini oluşturmayın; bu, çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class StreamWriter : public System::IO::TextWriter
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Close](./close/)() override | Akışı kapatır ve edinilen kaynakları serbest bırakır. |
| [Dispose](./dispose/)() override | Geçerli nesne tarafından kullanılan tüm kaynakları serbest bırakır ve temel akışı kapatır. |
| [Flush](./flush/)() override | Arabellek içeriğini temel akışa boşaltır ve ardından temel akışı boşaltır. |
| [get_AutoFlush](./get_autoflush/)() const | Her [StreamWriter::Write](./write/) yöntemi çağrıldığında [StreamWriter](./) nesnesinin verileri temel akışa boşaltıp boşaltmayacağını gösteren bir değer döndürür. |
| [get_BaseStream](./get_basestream/)() const | Temel akışı temsil eden bir nesneye ortak işaretçi döndürür. |
| [get_Encoding](./get_encoding/)() override | Şu anda kullanılan kodlamayı döndürür. |
| [set_AutoFlush](./set_autoflush/)(bool) | Her [StreamWriter::Write](./write/) yöntemi çağrıldığında [StreamWriter](./) nesnesinin verileri temel akışa boşaltıp boşaltmayacağını belirten bir değer döndürür. |
| [StreamWriter](./streamwriter/)(const SharedPtr\<Stream\>\&) | UTF-8 kodlamasını ve 1024 bayt varsayılan boyutlu bir arabellegi kullanarak belirtilen temel akışa karakter yazan bir [StreamWriter](./) nesnesi oluşturur. |
| [StreamWriter](./streamwriter/)(const SharedPtr\<Stream\>\&, const EncodingPtr\&) | Belirtilen kodlamayı ve 1024 bayt varsayılan boyutlu bir arabellegi kullanarak belirtilen temel akışa karakter yazan bir [StreamWriter](./) nesnesi oluşturur. |
| [StreamWriter](./streamwriter/)(const SharedPtr\<Stream\>\&, const EncodingPtr\&, int, bool) | Belirtilen kodlamayı ve belirtilen boyuttaki bir arabellegi kullanarak belirtilen temel akışa karakter yazan bir [StreamWriter](./) nesnesi oluşturur. Bir parametre, [StreamWriter](./) nesnesi yok edildiğinde temel akışın kapatılıp kapatılmayacağını belirler. |
| [StreamWriter](./streamwriter/)(const String\&) | UTF-8 kodlamasını ve 1024 bayt varsayılan boyutlu bir arabellegi kullanarak belirtilen dosyaya karakter yazan bir [StreamWriter](./) nesnesi oluşturur. |
| [StreamWriter](./streamwriter/)(const String\&, bool, const EncodingPtr\&) | Belirtilen kodlamayı ve 1024 bayt varsayılan boyutlu bir arabellegi kullanarak belirtilen dosyaya karakter yazan bir [StreamWriter](./) nesnesi oluşturur. Bir parametre, verinin dosyaya ekleneceğini ya da dosyanın üzerine yazılacağını belirler. |
| [StreamWriter](./streamwriter/)(const String\&, bool, const EncodingPtr\&, int) | Belirtilen kodlamayı ve belirtilen arabellek boyutunu kullanarak belirtilen dosyaya karakter yazan bir [StreamWriter](./) nesnesi oluşturur. Bir parametre, verinin dosyaya ekleneceğini ya da dosyanın üzerine yazılacağını belirler. |
| [Write](./write/)(char_t) override | Belirtilen karakteri akışa yazar. |
| [Write](./write/)(const String\&) override | Belirtilen dizeyi akışa yazar. |
| [Write](./write/)(const SharedPtr\<Object\>\&) override | Belirtilen nesnenin dize temsilini akışa yazar. |
| [Write](./write/)(const ArrayPtr\<char_t\>\&) override | Belirtilen diziden tüm karakterleri akışa yazar. |
| [Write](./write/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) override | Belirtilen karakter dizisinden belirtilen UTF-16 karakter alt aralığını akışa yazar. |
| [Write](./write/)(const char_t *) override | Belirtilen C-dizesini akışa yazar. |
| [Write](./write/)(const System::SharedPtr\<T\>\&) | Belirtilen nesnenin dize temsilini akışa yazar. |
| [WriteLine](./writeline/)() override | Satır sonlandırıcı karakterlerini akışa yazar. |
| [WriteLine](./writeline/)(const String\&) override | Belirtilen dizeyi ve ardından satır sonlandırıcı karakterlerini akışa yazar. |
| [WriteLine](./writeline/)(const SharedPtr\<Object\>\&) override | Belirtilen nesnenin dize temsilini ve ardından satır sonlandırıcı karakterlerini akışa yazar. |
| [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&) override | Belirtilen diziden tüm karakterleri, satır sonlandırma karakterleriyle birlikte akışa yazar. |
| [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) override | Belirtilen karakter dizisinden belirtilen UTF-16 karakter alt aralığını, satır sonlandırma karakterleriyle birlikte akışa yazar. |
| [WriteLine](./writeline/)(const char_t *) override | Belirtilen C dizesini, satır sonlandırma karakterleriyle birlikte akışa yazar. |
| [WriteLine](./writeline/)(const System::SharedPtr\<T\>\&) | Belirtilen nesnenin dize temsilini ve ardından satır sonlandırıcı karakterlerini akışa yazar. |
| [~StreamWriter](./~streamwriter/)() | Yıkıcı. |
## Ayrıca Bakınız

* Class [TextWriter](../textwriter/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
