---
title: Class License
second_title: Справочник по Aspose.GIS for .NET API
description: Aspose.Gis.License сорт. Предоставляет методы лицензирования компонента.
type: docs
weight: 1270
url: /ru/net/aspose.gis/license/
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

## Методы

| Имя | Описание |
| --- | --- |
| [SetLicense](../../aspose.gis/license/setlicense/#setlicense)(Stream) | Лицензирует компонент. |
| [SetLicense](../../aspose.gis/license/setlicense/#setlicense_1)(string) | Лицензирует компонент. |

### Примеры

В этом примере будет предпринята попытка найти файл лицензии с именем MyLicense.lic в папке, содержащей компонент, в папке, содержащей вызывающую сборку, в папке входной сборки, а затем в встроенные ресурсы вызывающей сборки.

```csharp
[C#]

License license = new License();
license.SetLicense("MyLicense.lic");


[Visual Basic]

Dim license As license = New license
License.SetLicense("MyLicense.lic")
```

### Смотрите также

* пространство имен [Aspose.Gis](../../aspose.gis/)
* сборка [Aspose.GIS](../../)


