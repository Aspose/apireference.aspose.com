---
title: "System::Xml::XmlWriter::Create méthode"
linktitle: "Créer"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XmlWriter::Create méthode. Crée une nouvelle instance XmlWriter en utilisant le flux spécifié en C++."
type: docs
weight: 3700
url: /fr/cpp/system.xml/xmlwriter/create/
---
## XmlWriter::Create(const SharedPtr\<IO::Stream\>\&) method


Crée une nouvelle instance [XmlWriter](../) en utilisant le flux spécifié.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<IO::Stream> &output)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| output | const SharedPtr\<IO::Stream\>\& | Le flux vers lequel vous souhaitez écrire. Le [XmlWriter](../) écrit la syntaxe texte XML 1.0 et l'ajoute au flux spécifié. |

### ReturnValue

Un objet [XmlWriter](../).

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::Create(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlWriterSettings\>) method


Crée une nouvelle instance [XmlWriter](../) en utilisant le flux et l'objet [XmlWriterSettings](../../xmlwritersettings/).

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<IO::Stream> &output, SharedPtr<XmlWriterSettings> settings)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| output | const SharedPtr\<IO::Stream\>\& | Le flux vers lequel vous souhaitez écrire. Le [XmlWriter](../) écrit la syntaxe texte XML 1.0 et l'ajoute au flux spécifié. |
| settings | SharedPtr\<XmlWriterSettings\> | L'objet [XmlWriterSettings](../../xmlwritersettings/) utilisé pour configurer la nouvelle instance [XmlWriter](../). Si celui‑ci est **nullptr**, un [XmlWriterSettings](../../xmlwritersettings/) avec les paramètres par défaut est utilisé. Si le [XmlWriter](../) est utilisé avec la méthode XslCompiledTransform:Transform(String,SharedPtr<XmlWriter>), vous devez utiliser la valeur XslCompiledTransform::get_OutputSettings pour obtenir un objet [XmlWriterSettings](../../xmlwritersettings/) avec les paramètres corrects. Cela garantit que l'objet [XmlWriter](../) créé possède les paramètres de sortie corrects. |

### ReturnValue

Un objet [XmlWriter](../).

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlWriterSettings](../../xmlwritersettings/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::Create(const SharedPtr\<IO::TextWriter\>\&) method


Crée une nouvelle instance [XmlWriter](../) en utilisant le TextWriter spécifié.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<IO::TextWriter> &output)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| output | const SharedPtr\<IO::TextWriter\>\& | Le TextWriter vers lequel vous souhaitez écrire. Le [XmlWriter](../) écrit la syntaxe texte XML 1.0 et l'ajoute au TextWriter spécifié. |

### ReturnValue

Un objet [XmlWriter](../).

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::Create(const SharedPtr\<IO::TextWriter\>\&, SharedPtr\<XmlWriterSettings\>) method


Crée une nouvelle instance [XmlWriter](../) en utilisant le TextWriter et les objets [XmlWriterSettings](../../xmlwritersettings/).

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<IO::TextWriter> &output, SharedPtr<XmlWriterSettings> settings)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| output | const SharedPtr\<IO::TextWriter\>\& | Le TextWriter vers lequel vous souhaitez écrire. Le [XmlWriter](../) écrit la syntaxe texte XML 1.0 et l'ajoute au TextWriter spécifié. |
| settings | SharedPtr\<XmlWriterSettings\> | L'objet [XmlWriterSettings](../../xmlwritersettings/) utilisé pour configurer la nouvelle instance [XmlWriter](../). Si celui‑ci est **nullptr**, un [XmlWriterSettings](../../xmlwritersettings/) avec les paramètres par défaut est utilisé. Si le [XmlWriter](../) est utilisé avec la méthode XslCompiledTransform:Transform(String,SharedPtr<XmlWriter>), vous devez utiliser la valeur XslCompiledTransform::get_OutputSettings pour obtenir un objet [XmlWriterSettings](../../xmlwritersettings/) avec les paramètres corrects. Cela garantit que l'objet [XmlWriter](../) créé possède les paramètres de sortie corrects. |

### ReturnValue

Un objet [XmlWriter](../).

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlWriterSettings](../../xmlwritersettings/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::Create(const SharedPtr\<Text::StringBuilder\>\&) method


Crée une nouvelle instance [XmlWriter](../) en utilisant le [Text::StringBuilder](../../../system.text/stringbuilder/) spécifié.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<Text::StringBuilder> &output)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| output | const SharedPtr\<Text::StringBuilder\>\& | Le [Text::StringBuilder](../../../system.text/stringbuilder/) vers lequel écrire. Le contenu écrit par le [XmlWriter](../) est ajouté au [Text::StringBuilder](../../../system.text/stringbuilder/). |

### ReturnValue

Un objet [XmlWriter](../).

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [StringBuilder](../../../system.text/stringbuilder/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::Create(const SharedPtr\<Text::StringBuilder\>\&, SharedPtr\<XmlWriterSettings\>) method


Crée une nouvelle instance [XmlWriter](../) en utilisant le [Text::StringBuilder](../../../system.text/stringbuilder/) et les objets [XmlWriterSettings](../../xmlwritersettings/).

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<Text::StringBuilder> &output, SharedPtr<XmlWriterSettings> settings)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| output | const SharedPtr\<Text::StringBuilder\>\& | Le [Text::StringBuilder](../../../system.text/stringbuilder/) vers lequel écrire. Le contenu écrit par le [XmlWriter](../) est ajouté au [Text::StringBuilder](../../../system.text/stringbuilder/). |
| settings | SharedPtr\<XmlWriterSettings\> | L'objet [XmlWriterSettings](../../xmlwritersettings/) utilisé pour configurer la nouvelle instance [XmlWriter](../). Si celui‑ci est **nullptr**, un [XmlWriterSettings](../../xmlwritersettings/) avec les paramètres par défaut est utilisé. Si le [XmlWriter](../) est utilisé avec la méthode XslCompiledTransform:Transform(String,SharedPtr<XmlWriter>), vous devez utiliser la valeur XslCompiledTransform::get_OutputSettings pour obtenir un objet [XmlWriterSettings](../../xmlwritersettings/) avec les paramètres corrects. Cela garantit que l'objet [XmlWriter](../) créé possède les paramètres de sortie corrects. |

### ReturnValue

Un objet [XmlWriter](../).

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [StringBuilder](../../../system.text/stringbuilder/)
* Class [XmlWriterSettings](../../xmlwritersettings/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::Create(const SharedPtr\<XmlWriter\>\&) method


Crée une nouvelle instance [XmlWriter](../) en utilisant l'objet [XmlWriter](../) spécifié.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<XmlWriter> &output)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| output | const SharedPtr\<XmlWriter\>\& | L'objet [XmlWriter](../) que vous souhaitez utiliser comme écrivain sous‑jacent. |

### ReturnValue

Un objet [XmlWriter](../) qui enveloppe l'objet [XmlWriter](../) spécifié.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::Create(const SharedPtr\<XmlWriter\>\&, SharedPtr\<XmlWriterSettings\>) method


Crée une nouvelle instance [XmlWriter](../) en utilisant les objets [XmlWriter](../) et [XmlWriterSettings](../../xmlwritersettings/) spécifiés.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<XmlWriter> &output, SharedPtr<XmlWriterSettings> settings)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| output | const SharedPtr\<XmlWriter\>\& | L'objet [XmlWriter](../) que vous souhaitez utiliser comme écrivain sous‑jacent. |
| settings | SharedPtr\<XmlWriterSettings\> | L'objet [XmlWriterSettings](../../xmlwritersettings/) utilisé pour configurer la nouvelle instance [XmlWriter](../). Si celui‑ci est **nullptr**, un [XmlWriterSettings](../../xmlwritersettings/) avec les paramètres par défaut est utilisé. Si le [XmlWriter](../) est utilisé avec la méthode XslCompiledTransform:Transform(String,SharedPtr<XmlWriter>), vous devez utiliser la valeur XslCompiledTransform::get_OutputSettings pour obtenir un objet [XmlWriterSettings](../../xmlwritersettings/) avec les paramètres corrects. Cela garantit que l'objet [XmlWriter](../) créé possède les paramètres de sortie corrects. |

### ReturnValue

Un objet [XmlWriter](../) qui enveloppe l'objet [XmlWriter](../) spécifié.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [XmlWriterSettings](../../xmlwritersettings/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::Create(const String\&) method


Crée une nouvelle instance [XmlWriter](../) en utilisant le nom de fichier spécifié.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const String &outputFileName)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| outputFileName | const String\& | Le fichier vers lequel vous souhaitez écrire. Le [XmlWriter](../) crée un fichier au chemin spécifié et y écrit en syntaxe texte XML 1.0. Le **outputFileName** doit être un chemin du système de fichiers. |

### ReturnValue

Un objet [XmlWriter](../).

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::Create(const String\&, SharedPtr\<XmlWriterSettings\>) method


Crée une nouvelle instance [XmlWriter](../) en utilisant le nom de fichier et l'objet [XmlWriterSettings](../../xmlwritersettings/).

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const String &outputFileName, SharedPtr<XmlWriterSettings> settings)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| outputFileName | const String\& | Le fichier vers lequel vous souhaitez écrire. Le [XmlWriter](../) crée un fichier au chemin spécifié et y écrit en syntaxe texte XML 1.0. Le **outputFileName** doit être un chemin du système de fichiers. |
| settings | SharedPtr\<XmlWriterSettings\> | L'objet [XmlWriterSettings](../../xmlwritersettings/) utilisé pour configurer la nouvelle instance [XmlWriter](../). Si celui‑ci est **nullptr**, un [XmlWriterSettings](../../xmlwritersettings/) avec les paramètres par défaut est utilisé. Si le [XmlWriter](../) est utilisé avec la méthode XslCompiledTransform:Transform(String,SharedPtr<XmlWriter>), vous devez utiliser la valeur XslCompiledTransform::get_OutputSettings pour obtenir un objet [XmlWriterSettings](../../xmlwritersettings/) avec les paramètres corrects. Cela garantit que l'objet [XmlWriter](../) créé possède les paramètres de sortie corrects. |

### ReturnValue

Un objet [XmlWriter](../).

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [String](../../../system/string/)
* Class [XmlWriterSettings](../../xmlwritersettings/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
