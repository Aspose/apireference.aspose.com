---
title: "System::Net::Http::Headers::ProductInfoHeaderValue класс"
linktitle: "ProductInfoHeaderValue"
second_title: "Aspose.Font для C++"
description: "System::Net::Http::Headers::ProductInfoHeaderValue класс. Представляет продукт или комментарий в значении заголовка ''User-Agent''. Объекты этого класса должны выделяться только с помощью функции System::MakeObject(). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 1800
url: /ru/cpp/system.net.http.headers/productinfoheadervalue/
---
## ProductInfoHeaderValue class


Представляет продукт или комментарий в значении заголовка 'User-Agent'. Объекты этого класса должны выделяться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class ProductInfoHeaderValue : public System::ICloneable
```

## Методы

| Метод | Описание |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Сравнивает объекты, используя семантику C# [Object.Equals](../../system/object/equals/). |
| [get_Comment](./get_comment/)() | Возвращает комментарий. |
| [get_Product](./get_product/)() | Информация RTTI. |
| [GetHashCode](./gethashcode/)() const override | Аналог метода C# [Object.GetHashCode()](../../system/object/gethashcode/). Позволяет хешировать пользовательские объекты. |
| static [GetProductInfoLength](./getproductinfolength/)(String, int32_t, System::SharedPtr\<ProductInfoHeaderValue\>\&) | Преобразует переданную строку, начиная с указанного индекса, в экземпляр класса [ProductInfoHeaderValue](./). |
| static [Parse](./parse/)(String) | Преобразует переданную строку в экземпляр класса [ProductInfoHeaderValue](./). |
| [ProductInfoHeaderValue](./productinfoheadervalue/)(String, String) | Создаёт новый экземпляр. |
| [ProductInfoHeaderValue](./productinfoheadervalue/)(System::SharedPtr\<ProductHeaderValue\>) | Создаёт новый экземпляр. |
| [ProductInfoHeaderValue](./productinfoheadervalue/)(String) | Создаёт новый экземпляр. |
| [ToString](./tostring/)() const override | Аналог метода C# [Object.ToString()](../../system/object/tostring/). Позволяет преобразовывать пользовательские объекты в строку. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<ProductInfoHeaderValue\>\&) | Пытается преобразовать переданную строку в экземпляр класса [ProductInfoHeaderValue](./). |
## См. также

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
