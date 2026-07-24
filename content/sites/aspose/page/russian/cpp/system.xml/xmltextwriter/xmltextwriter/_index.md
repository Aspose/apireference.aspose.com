---
title: "System::Xml::XmlTextWriter::XmlTextWriter конструктор"
linktitle: "XmlTextWriter"
second_title: "Aspose.Page для C++"
description: "System::Xml::XmlTextWriter::XmlTextWriter конструктор. Создает экземпляр класса XmlTextWriter, используя указанный поток и кодировку в C++."
type: docs
weight: 100
url: /ru/cpp/system.xml/xmltextwriter/xmltextwriter/
---
## XmlTextWriter::XmlTextWriter(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<Text::Encoding\>\&) constructor


Создает экземпляр класса [XmlTextWriter](../), используя указанный поток и кодировку.

```cpp
System::Xml::XmlTextWriter::XmlTextWriter(const SharedPtr<IO::Stream> &w, const SharedPtr<Text::Encoding> &encoding)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| w | const SharedPtr\<IO::Stream\>\& | Поток, в который вы хотите записывать. |
| кодировка | const SharedPtr\<Text::Encoding\>\& | Кодировка для генерации. Если кодировка равна **nullptr**, поток записывается в формате UTF-8 и атрибут кодировки опускается в **ProcessingInstruction**. |

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [Encoding](../../../system.text/encoding/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextWriter::XmlTextWriter(const SharedPtr\<IO::TextWriter\>\&) constructor


Создает экземпляр класса [XmlTextWriter](../), используя указанный TextWriter.

```cpp
System::Xml::XmlTextWriter::XmlTextWriter(const SharedPtr<IO::TextWriter> &w)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| w | const SharedPtr\<IO::TextWriter\>\& | TextWriter для записи. Предполагается, что TextWriter уже настроен на правильную кодировку. |

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextWriter::XmlTextWriter(const String\&, const SharedPtr\<Text::Encoding\>\&) constructor


Создает экземпляр класса [XmlTextWriter](../), используя указанный файл.

```cpp
System::Xml::XmlTextWriter::XmlTextWriter(const String &filename, const SharedPtr<Text::Encoding> &encoding)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| filename | const String\& | Имя файла для записи. Если файл существует, он будет усечён и перезаписан новым содержимым. |
| кодировка | const SharedPtr\<Text::Encoding\>\& | Кодировка для генерации. Если кодировка равна **nullptr**, файл записывается в формате UTF-8 и атрибут кодировки опускается в **ProcessingInstruction**. |

## См. также

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Encoding](../../../system.text/encoding/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
