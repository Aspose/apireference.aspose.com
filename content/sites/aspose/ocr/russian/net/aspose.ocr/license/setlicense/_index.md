---
title: License.SetLicense
second_title: Справочник по Aspose.OCR для .NET API
description: License метод. Лицензирует компонент.
type: docs
weight: 30
url: /ru/net/aspose.ocr/license/setlicense/
---
## SetLicense(string) {#setlicense_1}

Лицензирует компонент.

```csharp
public void SetLicense(string licenseName)
```

### Примечания

Пытается найти лицензию в следующих местах:

1. Явный путь.

2. Папка, содержащая сборку компонента Aspose.

3. Папка, содержащая вызывающую сборку клиента.

4. Папка, содержащая входную (загрузочную) сборку.

5. Встроенный ресурс в вызывающей сборке клиента.

**Примечание:**В .NET Compact Framework пытается найти лицензию только в следующих местах:

1. Явный путь.

2. Встроенный ресурс в вызывающей сборке клиента.

### Примеры

В этом примере будет предпринята попытка найти файл лицензии с именем MyLicense.lic в папке, содержащей компонент, в папке, содержащей вызывающую сборку, в папке входной сборки, а затем в встроенные ресурсы вызывающей сборки. Может быть полным или коротким именем файла или именем внедренного ресурса. Используйте пустую строку для переключения в режим оценки.

```csharp
[C#]

License license = new License();
license.SetLicense("MyLicense.lic");
```

### Смотрите также

* class [License](../)
* пространство имен [Aspose.OCR](../../license/)
* сборка [Aspose.OCR](../../../)

---

## SetLicense(Stream) {#setlicense}

Лицензирует компонент.

```csharp
public void SetLicense(Stream stream)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| stream | Stream | Поток, содержащий лицензию. |

### Примечания

Используйте этот метод для загрузки лицензии из потока.

### Примеры

```csharp
[C#]

License license = new License();
license.SetLicense(myStream);
```

### Смотрите также

* class [License](../)
* пространство имен [Aspose.OCR](../../license/)
* сборка [Aspose.OCR](../../../)


