---
title: "System::IO::StreamReader::StreamReader constructor"
linktitle: "StreamReader"
second_title: "Aspose.Font pour C++"
description: "System::IO::StreamReader::StreamReader constructor. Construit une instance de l'objet StreamReader qui lit les caractères du flux sous-jacent spécifié en utilisant l'encodage UTF-8 et un tampon de taille par défaut de 1024 octets en C++."
type: docs
weight: 100
url: /fr/cpp/system.io/streamreader/streamreader/
---
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&) constructor


Construit une instance de l'objet [StreamReader](../) qui lit les caractères du flux sous-jacent spécifié en utilisant l'encodage UTF-8 et un tampon de taille par défaut de 1024 octets.

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| flux | const SharedPtr\<Stream\>\& | Le flux sous-jacent à partir duquel lire les caractères |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&, bool) constructor


Construit une instance de l'objet [StreamReader](../) qui lit les caractères du flux sous-jacent spécifié en utilisant l'encodage UTF-8 et un tampon de taille par défaut de 1024 octets. Un paramètre indique si la détection du marqueur d'ordre des octets doit être activée.

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream, bool detectEncodingFromByteOrderMarks)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| flux | const SharedPtr\<Stream\>\& | Le flux sous-jacent à partir duquel lire les caractères |
| detectEncodingFromByteOrderMarks | bool | Vrai pour rechercher les marques d'ordre d'octet au début du flux, sinon - faux |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&, const EncodingPtr\&) constructor


Construit une instance de l'objet [StreamReader](../) qui lit les caractères du flux sous-jacent spécifié en utilisant l'encodage spécifié et un tampon de taille par défaut de 1024 octets.

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream, const EncodingPtr &encoding)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| flux | const SharedPtr\<Stream\>\& | Le flux sous-jacent à partir duquel lire les caractères |
| encoding | const EncodingPtr\& | L'encodage à utiliser |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&, const EncodingPtr\&, bool) constructor


Construit une instance de l'objet [StreamReader](../) qui lit les caractères du flux sous-jacent spécifié en utilisant l'encodage spécifié et un tampon de taille par défaut de 1024 octets. Un paramètre indique si la détection des marques d'ordre d'octet doit être activée.

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream, const EncodingPtr &encoding, bool detectEncodingFromByteOrderMarks)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| flux | const SharedPtr\<Stream\>\& | Le flux sous-jacent à partir duquel lire les caractères |
| encoding | const EncodingPtr\& | L'encodage à utiliser |
| detectEncodingFromByteOrderMarks | bool | Vrai pour rechercher les marques d'ordre d'octet au début du flux, sinon - faux |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&, const EncodingPtr\&, bool, int) constructor


Construit une instance de l'objet [StreamReader](../) qui lit les caractères du flux sous-jacent spécifié en utilisant l'encodage spécifié et un tampon de la taille spécifiée. Un paramètre indique si la détection des marques d'ordre d'octet doit être activée.

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream, const EncodingPtr &encoding, bool detectEncodingFromByteOrderMarks, int bufferSize)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| flux | const SharedPtr\<Stream\>\& | Le flux sous-jacent à partir duquel lire les caractères |
| encoding | const EncodingPtr\& | L'encodage à utiliser |
| detectEncodingFromByteOrderMarks | bool | Vrai pour rechercher les marques d'ordre d'octet au début du flux, sinon - faux |
| bufferSize | int | La taille minimale du tampon en octets |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::StreamReader(const System::String\&) constructor


Construit une instance de l'objet [StreamReader](../) qui lit les caractères du fichier spécifié en utilisant l'encodage UTF-8 et un tampon de taille par défaut de 4096 octets.

```cpp
System::IO::StreamReader::StreamReader(const System::String &path)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| chemin | const System::String\& | Le chemin du fichier à partir duquel lire les caractères |

## Voir aussi

* Class [String](../../../system/string/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::StreamReader(const System::String\&, bool) constructor


Construit une instance de l'objet [StreamReader](../) qui lit les caractères du fichier spécifié en utilisant l'encodage UTF-8 et un tampon de taille par défaut de 4096 octets. Un paramètre indique si la détection des marques d'ordre d'octet doit être activée.

```cpp
System::IO::StreamReader::StreamReader(const System::String &path, bool detectEncodingFromByteOrderMarks)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| chemin | const System::String\& | Le chemin du fichier à partir duquel lire les caractères |
| detectEncodingFromByteOrderMarks | bool | Vrai pour rechercher les marques d'ordre d'octet au début du fichier, sinon - faux |

## Voir aussi

* Class [String](../../../system/string/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::StreamReader(const System::String\&, const EncodingPtr\&) constructor


Construit une instance de l'objet [StreamReader](../) qui lit les caractères du fichier spécifié en utilisant l'encodage spécifié et un tampon de taille par défaut de 4096 octets.

```cpp
System::IO::StreamReader::StreamReader(const System::String &path, const EncodingPtr &encoding)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| chemin | const System::String\& | Le chemin du fichier à partir duquel lire les caractères |
| encoding | const EncodingPtr\& | L'encodage à utiliser |

## Voir aussi

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::StreamReader(const System::String\&, const EncodingPtr\&, bool) constructor


Construit une instance de l'objet [StreamReader](../) qui lit les caractères du flux sous-jacent spécifié en utilisant l'encodage spécifié et un tampon de taille par défaut de 4096 octets. Un paramètre indique si la détection des marques d'ordre d'octet doit être activée.

```cpp
System::IO::StreamReader::StreamReader(const System::String &path, const EncodingPtr &encoding, bool detectEncodingFromByteOrderMarks)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| chemin | const System::String\& | Le chemin du fichier à partir duquel lire les caractères |
| encoding | const EncodingPtr\& | L'encodage à utiliser |
| detectEncodingFromByteOrderMarks | bool | Vrai pour rechercher les marques d'ordre d'octet au début du fichier, sinon - faux |

## Voir aussi

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::StreamReader(const System::String\&, const EncodingPtr\&, bool, int) constructor


Construit une instance de l'objet [StreamReader](../) qui lit les caractères du fichier spécifié en utilisant l'encodage spécifié et un tampon de la taille spécifiée. Un paramètre indique si la détection des marques d'ordre d'octet doit être activée.

```cpp
System::IO::StreamReader::StreamReader(const System::String &path, const EncodingPtr &encoding, bool detectEncodingFromByteOrderMarks, int bufferSize)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| chemin | const System::String\& | Le chemin du fichier à partir duquel lire les caractères |
| encoding | const EncodingPtr\& | L'encodage à utiliser |
| detectEncodingFromByteOrderMarks | bool | Vrai pour rechercher les marques d'ordre d'octet au début du fichier, sinon - faux |
| bufferSize | int | La taille minimale du tampon en octets |

## Voir aussi

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
