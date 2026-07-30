---
title: "System::ExceptionWrapper sınıfı"
linktitle: "ExceptionWrapper"
second_title: "Aspose.Font için C++"
description: "System::ExceptionWrapper sınıfı. C++'da Exception sınıfından türetilen istisnaların sarmalayıcısını temsil eden şablon."
type: docs
weight: 2600
url: /tr/cpp/system/exceptionwrapper/
---
## ExceptionWrapper class


İstisnaların [Exception](../exception/) sınıfından türetilen sarmalayıcısını temsil eden şablon.

```cpp
template<typename T>class ExceptionWrapper
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [ExceptionWrapper](./exceptionwrapper/)(std::nullptr_t) | [ExceptionWrapper](./) sınıfının herhangi bir istisna temsil etmeyen null örneğini oluşturur. |
| [ExceptionWrapper](./exceptionwrapper/)(const ExceptionPtr\&) | Geçilen işaretçiyi içeren [ExceptionWrapper](./) sınıfının bir örneğini oluşturur. |
| [ExceptionWrapper](./exceptionwrapper/)(const ExceptionWrapper\&) | Kopya yapıcı. |
| [ExceptionWrapper](./exceptionwrapper/)(ExceptionWrapper\&&) | Taşıma kurucusu. |
| explicit [ExceptionWrapper](./exceptionwrapper/)(Args\&&...) | [Exception](../exception/) sınıfı yapıcılarına parametreleri ileten ve yeni bir [Exception](../exception/) sınıfı örneğini tutan akıllı işaretçi oluşturan yapıcı. |
| static [operator new](./operatornew/)(std::size_t) |  |
| static [operator new[]](./operatornew[]/)(std::size_t) |  |
| [operator SharedPtr< Object >](./operatorsharedptr_object_/)() | [SharedPtr<Object>](../sharedptr/) için örtük dönüşüm operatörü |
| [operator->](./operator-_/)() const | [Exception](../exception/) nesnesinin üyelerine erişim sağlar. |
| [operator=](./operator=/)(const ExceptionWrapper\&) | Atama operatörü. |
| [operator=](./operator=/)(ExceptionWrapper\&&) | Taşıma atama operatörü. |
| static [Type](./type/)() | [Exception](../exception/) türü için [System::TypeInfo](../typeinfo/) nesnesini almanın kısayolu. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [ExceptionType](./exceptiontype/) | Dönüştürme işlevleri için kullanılır. |
## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
