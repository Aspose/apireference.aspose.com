---
title: "Méthode System::Xml::XmlReader::Create"
linktitle: "Créer"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Xml::XmlReader::Create. Crée une nouvelle instance XmlReader en utilisant le flux spécifié avec les paramètres par défaut en C++."
type: docs
weight: 7700
url: /fr/cpp/system.xml/xmlreader/create/
---
## XmlReader::Create(const SharedPtr\<IO::Stream\>\&) method


Crée une nouvelle instance [XmlReader](../) en utilisant le flux spécifié avec les paramètres par défaut.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::Stream> &input)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| input | const SharedPtr\<IO::Stream\>\& | Le flux qui contient les données XML. Le [XmlReader](../) analyse les premiers octets du flux à la recherche d'une marque d'ordre d'octets ou d'un autre indice d'encodage. Une fois l'encodage déterminé, il est utilisé pour poursuivre la lecture du flux, et le traitement continue d'analyser l'entrée comme un flux de caractères (Unicode). |

### ReturnValue

Un objet utilisé pour lire les données XML dans le flux.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlReaderSettings\>\&) method


Crée une nouvelle instance [XmlReader](../) avec le flux spécifié et les paramètres.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::Stream> &input, const SharedPtr<XmlReaderSettings> &settings)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| input | const SharedPtr\<IO::Stream\>\& | Le flux qui contient les données XML. Le [XmlReader](../) analyse les premiers octets du flux à la recherche d'une marque d'ordre d'octets ou d'un autre indice d'encodage. Une fois l'encodage déterminé, il est utilisé pour poursuivre la lecture du flux, et le traitement continue d'analyser l'entrée comme un flux de caractères (Unicode). |
| settings | const SharedPtr\<XmlReaderSettings\>\& | Les paramètres pour la nouvelle instance [XmlReader](../). Cette valeur peut être **nullptr**. |

### ReturnValue

Un objet utilisé pour lire les données XML dans le flux.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) method


Crée une nouvelle instance de [XmlReader](../) en utilisant le flux spécifié, les paramètres et les informations de contexte pour l'analyse.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::Stream> &input, SharedPtr<XmlReaderSettings> settings, const SharedPtr<XmlParserContext> &inputContext)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| input | const SharedPtr\<IO::Stream\>\& | Le flux qui contient les données XML. Le [XmlReader](../) analyse les premiers octets du flux à la recherche d'une marque d'ordre d'octets ou d'un autre indice d'encodage. Une fois l'encodage déterminé, il est utilisé pour poursuivre la lecture du flux, et le traitement continue d'analyser l'entrée comme un flux de caractères (Unicode). |
| settings | SharedPtr\<XmlReaderSettings\> | Les paramètres pour la nouvelle instance [XmlReader](../). Cette valeur peut être **nullptr**. |
| inputContext | const SharedPtr\<XmlParserContext\>\& | Les informations de contexte requises pour analyser le fragment XML. Les informations de contexte peuvent inclure le [XmlNameTable](../../xmlnametable/) à utiliser, l'encodage, la portée du namespace, la portée actuelle de **xml:lang** et **xml:space**, l'URI de base et la définition du type de document. Cette valeur peut être **nullptr**. |

### ReturnValue

Un objet utilisé pour lire les données XML dans le flux.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlReaderSettings\>, const String\&) method


Crée une nouvelle instance de [XmlReader](../) en utilisant le flux spécifié, l'URI de base et les paramètres.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::Stream> &input, SharedPtr<XmlReaderSettings> settings, const String &baseUri)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| input | const SharedPtr\<IO::Stream\>\& | Le flux qui contient les données XML. Le [XmlReader](../) analyse les premiers octets du flux à la recherche d'une marque d'ordre d'octets ou d'un autre indice d'encodage. Une fois l'encodage déterminé, il est utilisé pour poursuivre la lecture du flux, et le traitement continue d'analyser l'entrée comme un flux de caractères (Unicode). |
| settings | SharedPtr\<XmlReaderSettings\> | Les paramètres pour la nouvelle instance [XmlReader](../). Cette valeur peut être **nullptr**. |
| baseUri | const String\& | L'URI de base pour l'entité ou le document en cours de lecture. Cette valeur peut être **nullptr**. **[Security](../../../system.security/) Note** L'URI de base est utilisé pour résoudre l'URI relative du document XML. N'utilisez pas d'URI de base provenant d'une source non fiable. |

### ReturnValue

Un objet utilisé pour lire les données XML dans le flux.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::TextReader\>\&) method


Crée une nouvelle instance de [XmlReader](../) en utilisant le lecteur de texte spécifié.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::TextReader> &input)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| input | const SharedPtr\<IO::TextReader\>\& | Le lecteur de texte à partir duquel lire les données XML. Un lecteur de texte renvoie un flux de caractères Unicode, de sorte que l'encodage spécifié dans la déclaration XML n'est pas utilisé par le lecteur XML pour décoder le flux de données. |

### ReturnValue

Un objet utilisé pour lire les données XML dans le flux.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlReaderSettings\>\&) method


Crée une nouvelle instance de [XmlReader](../) en utilisant le lecteur de texte et les paramètres spécifiés.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::TextReader> &input, const SharedPtr<XmlReaderSettings> &settings)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| input | const SharedPtr\<IO::TextReader\>\& | Le lecteur de texte à partir duquel lire les données XML. Un lecteur de texte renvoie un flux de caractères Unicode, de sorte que l'encodage spécifié dans la déclaration XML n'est pas utilisé par le lecteur XML pour décoder le flux de données. |
| settings | const SharedPtr\<XmlReaderSettings\>\& | Les paramètres pour le nouveau [XmlReader](../). Cette valeur peut être **nullptr**. |

### ReturnValue

Un objet utilisé pour lire les données XML dans le flux.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::TextReader\>\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) method


Crée une nouvelle instance de [XmlReader](../) en utilisant le lecteur de texte, les paramètres et les informations de contexte spécifiés pour l'analyse.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::TextReader> &input, SharedPtr<XmlReaderSettings> settings, const SharedPtr<XmlParserContext> &inputContext)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| input | const SharedPtr\<IO::TextReader\>\& | Le lecteur de texte à partir duquel lire les données XML. Un lecteur de texte renvoie un flux de caractères Unicode, de sorte que l'encodage spécifié dans la déclaration XML n'est pas utilisé par le lecteur XML pour décoder le flux de données. |
| settings | SharedPtr\<XmlReaderSettings\> | Les paramètres pour la nouvelle instance [XmlReader](../). Cette valeur peut être **nullptr**. |
| inputContext | const SharedPtr\<XmlParserContext\>\& | Les informations de contexte requises pour analyser le fragment XML. Les informations de contexte peuvent inclure le [XmlNameTable](../../xmlnametable/) à utiliser, l'encodage, la portée du namespace, la portée actuelle de **xml:lang** et **xml:space**, l'URI de base et la définition du type de document. Cette valeur peut être **nullptr**. |

### ReturnValue

Un objet utilisé pour lire les données XML dans le flux.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::TextReader\>\&, SharedPtr\<XmlReaderSettings\>, const String\&) method


Crée une nouvelle instance de [XmlReader](../) en utilisant le lecteur de texte, les paramètres et l'URI de base spécifiés.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::TextReader> &input, SharedPtr<XmlReaderSettings> settings, const String &baseUri)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| input | const SharedPtr\<IO::TextReader\>\& | Le lecteur de texte à partir duquel lire les données XML. Un lecteur de texte renvoie un flux de caractères Unicode, de sorte que l'encodage spécifié dans la déclaration XML n'est pas utilisé par le [XmlReader](../) pour décoder le flux de données. |
| settings | SharedPtr\<XmlReaderSettings\> | Les paramètres pour la nouvelle instance [XmlReader](../). Cette valeur peut être **nullptr**. |
| baseUri | const String\& | L'URI de base pour l'entité ou le document en cours de lecture. Cette valeur peut être **nullptr**. **[Security](../../../system.security/) Note** L'URI de base est utilisé pour résoudre l'URI relative du document XML. N'utilisez pas d'URI de base provenant d'une source non fiable. |

### ReturnValue

Un objet utilisé pour lire les données XML dans le flux.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const SharedPtr\<XmlReader\>\&, SharedPtr\<XmlReaderSettings\>) method


Crée une nouvelle instance de [XmlReader](../) en utilisant le lecteur XML et les paramètres spécifiés.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<XmlReader> &reader, SharedPtr<XmlReaderSettings> settings)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| lecteur | const SharedPtr\<XmlReader\>\& | L'objet que vous souhaitez utiliser comme lecteur XML sous-jacent. |
| settings | SharedPtr\<XmlReaderSettings\> | Les paramètres pour la nouvelle instance de [XmlReader](../). Le niveau de conformité de l'objet [XmlReaderSettings](../../xmlreadersettings/) doit soit correspondre au niveau de conformité du lecteur sous-jacent, soit être défini sur [ConformanceLevel::Auto](../../conformancelevel/). |

### ReturnValue

Un objet qui enveloppe l'objet [XmlReader](../) spécifié.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const String\&) method


Crée une nouvelle instance de [XmlReader](../) avec l'URI spécifié.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const String &inputUri)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| inputUri | const String\& | L'URI du fichier contenant les données XML. La classe [XmlUrlResolver](../../xmlurlresolver/) est utilisée pour convertir le chemin en une représentation canonique des données. |

### ReturnValue

Un objet utilisé pour lire les données XML dans le flux.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const String\&, const SharedPtr\<XmlReaderSettings\>\&) method


Crée une nouvelle instance de [XmlReader](../) en utilisant l'URI et les paramètres spécifiés.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const String &inputUri, const SharedPtr<XmlReaderSettings> &settings)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| inputUri | const String\& | L'URI du fichier contenant les données XML. L'objet [XmlResolver](../../xmlresolver/) sur l'objet [XmlReaderSettings](../../xmlreadersettings/) est utilisé pour convertir le chemin en une représentation canonique des données. Si la valeur de XmlReaderSettings::get_XmlResolver est **nullptr**, un nouvel objet [XmlUrlResolver](../../xmlurlresolver/) est utilisé. |
| settings | const SharedPtr\<XmlReaderSettings\>\& | Les paramètres pour la nouvelle instance [XmlReader](../). Cette valeur peut être **nullptr**. |

### ReturnValue

Un objet utilisé pour lire les données XML dans le flux.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [String](../../../system/string/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const String\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) method


Crée une nouvelle instance de [XmlReader](../) en utilisant l'URI, les paramètres et les informations de contexte spécifiés pour l'analyse.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const String &inputUri, SharedPtr<XmlReaderSettings> settings, const SharedPtr<XmlParserContext> &inputContext)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| inputUri | const String\& | L'URI du fichier contenant les données XML. L'objet [XmlResolver](../../xmlresolver/) sur l'objet [XmlReaderSettings](../../xmlreadersettings/) est utilisé pour convertir le chemin en une représentation canonique des données. Si la valeur de XmlReaderSettings::get_XmlResolver est **nullptr**, un nouvel objet [XmlUrlResolver](../../xmlurlresolver/) est utilisé. |
| settings | SharedPtr\<XmlReaderSettings\> | Les paramètres pour la nouvelle instance [XmlReader](../). Cette valeur peut être **nullptr**. |
| inputContext | const SharedPtr\<XmlParserContext\>\& | Les informations de contexte requises pour analyser le fragment XML. Les informations de contexte peuvent inclure le [XmlNameTable](../../xmlnametable/) à utiliser, l'encodage, la portée du namespace, la portée actuelle de **xml:lang** et **xml:space**, l'URI de base et la définition du type de document. Cette valeur peut être **nullptr**. |

### ReturnValue

Un objet utilisé pour lire les données XML dans le flux.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [String](../../../system/string/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
