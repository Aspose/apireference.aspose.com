---
title: "System::Net::Http::Headers::TransferCodingWithQualityHeaderValue класс"
linktitle: "TransferCodingWithQualityHeaderValue"
second_title: "Aspose.Font для C++"
description: "System::Net::Http::Headers::TransferCodingWithQualityHeaderValue класс. Представляет значение с дополнительным параметром качества заголовка ''Accept-Encoding''. Объекты этого класса должны выделяться только с помощью функции System::MakeObject(). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 2500
url: /ru/cpp/system.net.http.headers/transfercodingwithqualityheadervalue/
---
## TransferCodingWithQualityHeaderValue class


Представляет значение с дополнительным параметром качества заголовка 'Accept-Encoding'. Объекты этого класса должны выделяться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class TransferCodingWithQualityHeaderValue : public System::Net::Http::Headers::TransferCodingHeaderValue
```

## Методы

| Метод | Описание |
| --- | --- |
| [get_Quality](./get_quality/)() | Информация RTTI. |
| static [Parse](./parse/)(String) | Преобразует переданную строку в экземпляр класса [TransferCodingWithQualityHeaderValue](./). |
| [set_Quality](./set_quality/)(Nullable\<double\>) | Устанавливает значение качества заголовка 'Accept-Encoding'. |
| [TransferCodingWithQualityHeaderValue](./transfercodingwithqualityheadervalue/)() | Создаёт новый экземпляр. |
| [TransferCodingWithQualityHeaderValue](./transfercodingwithqualityheadervalue/)(String) | Создаёт новый экземпляр. |
| [TransferCodingWithQualityHeaderValue](./transfercodingwithqualityheadervalue/)(String, double) | Создаёт новый экземпляр. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<TransferCodingWithQualityHeaderValue\>\&) | Пытается преобразовать переданную строку в экземпляр класса [TransferCodingWithQualityHeaderValue](./). |
## См. также

* Class [TransferCodingHeaderValue](../transfercodingheadervalue/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
