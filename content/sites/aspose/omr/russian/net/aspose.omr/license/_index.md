---
title: Class License
second_title: Справочник по Aspose.OMR для .NET API
description: Aspose.OMR.License сорт. Предоставляет методы лицензирования компонента.
type: docs
weight: 770
url: /ru/net/aspose.omr/license/
---
## License class

Предоставляет методы лицензирования компонента.

```csharp
public class License
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [License](license/)() | Конструктор по умолчанию. |

## Характеристики

| Имя | Описание |
| --- | --- |
| [Embedded](../../aspose.omr/license/embedded/) { get; set; } | Номер лицензии добавлен как встроенный ресурс. |

## Методы

| Имя | Описание |
| --- | --- |
| [SetLicense](../../aspose.omr/license/setlicense/#setlicense)(Stream) | Лицензирует компонент. |
| [SetLicense](../../aspose.omr/license/setlicense/#setlicense_1)(string) | Лицензирует компонент. |

### Примеры

В этом примере будет предпринята попытка найти файл лицензии с именем MyLicense.lic в папке, содержащей компонент, в папке, содержащей вызывающую сборку, в папке входной сборки, а затем во встроенной ресурсы вызывающей сборки.

```csharp
[C#]

License license = new License();
license.SetLicense("MyLicense.lic");


[Visual Basic]

Dim license As license = New license
License.SetLicense("MyLicense.lic")
```

### Смотрите также

* пространство имен [Aspose.OMR](../../aspose.omr/)
* сборка [Aspose.OMR](../../)


