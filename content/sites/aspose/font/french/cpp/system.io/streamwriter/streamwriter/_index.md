---
title: "Constructeur System::IO::StreamWriter::StreamWriter"
linktitle: "StreamWriter"
second_title: "Aspose.Font pour C++"
description: "Constructeur System::IO::StreamWriter::StreamWriter. Crée une instance de l'objet StreamWriter qui écrit des caractères dans le flux sous-jacent spécifié en utilisant l'encodage UTF-8 et un tampon d'une taille par défaut de 1024 octets en C++."
type: docs
weight: 100
url: /fr/cpp/system.io/streamwriter/streamwriter/
---
## StreamWriter::StreamWriter(const SharedPtr\<Stream\>\&) constructor


Crée une instance de l'objet [StreamWriter](../) qui écrit des caractères dans le flux sous-jacent spécifié en utilisant l'encodage UTF-8 et un tampon d'une taille par défaut de 1024 octets.

```cpp
System::IO::StreamWriter::StreamWriter(const SharedPtr<Stream> &stream)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| flux | const SharedPtr\<Stream\>\& | Le flux sous-jacent dans lequel écrire des caractères |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::StreamWriter(const SharedPtr\<Stream\>\&, const EncodingPtr\&) constructor


Crée une instance de l'objet [StreamWriter](../) qui écrit des caractères dans le flux sous-jacent spécifié en utilisant l'encodage spécifié et un tampon d'une taille par défaut de 1024 octets.

```cpp
System::IO::StreamWriter::StreamWriter(const SharedPtr<Stream> &stream, const EncodingPtr &encoding)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| flux | const SharedPtr\<Stream\>\& | Le flux sous-jacent dans lequel écrire des caractères |
| encoding | const EncodingPtr\& | L'encodage à utiliser |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::StreamWriter(const SharedPtr\<Stream\>\&, const EncodingPtr\&, int, bool) constructor


Crée une instance de l'objet [StreamWriter](../) qui écrit des caractères dans le flux sous-jacent spécifié en utilisant l'encodage spécifié et un tampon de la taille spécifiée. Un paramètre indique si le flux sous-jacent doit être fermé lorsque l'objet [StreamWriter](../) est libéré.

```cpp
System::IO::StreamWriter::StreamWriter(const SharedPtr<Stream> &stream, const EncodingPtr &encoding, int buffer_size, bool leave_open=false)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| flux | const SharedPtr\<Stream\>\& | Le flux sous-jacent dans lequel écrire des caractères |
| encoding | const EncodingPtr\& | L'encodage à utiliser |
| buffer_size | int | La taille minimale du tampon en octets |
| leave_open | bool | Indique si le flux sous-jacent doit rester ouvert après la libération de l'objet [StreamWriter](../) actuel |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::StreamWriter(const String\&) constructor


Crée une instance de l'objet [StreamWriter](../) qui écrit des caractères dans le fichier spécifié en utilisant l'encodage UTF-8 et un tampon d'une taille par défaut de 1024 octets.

```cpp
System::IO::StreamWriter::StreamWriter(const String &path)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| chemin | const String\& | Le chemin du fichier dans lequel écrire des caractères |

## Voir aussi

* Class [String](../../../system/string/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::StreamWriter(const String\&, bool, const EncodingPtr\&, int) constructor


Crée une instance de l'objet [StreamWriter](../) qui écrit des caractères dans le fichier spécifié en utilisant l'encodage et la taille de tampon spécifiés. Un paramètre indique si les données doivent être ajoutées au fichier ou si le fichier doit être écrasé.

```cpp
System::IO::StreamWriter::StreamWriter(const String &path, bool append, const EncodingPtr &encoding, int buffer_size)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| chemin | const String\& | Le chemin du fichier dans lequel écrire des caractères |
| append | bool | Indique si les données doivent être ajoutées au fichier spécifié (true) ou si le fichier doit être écrasé (false) |
| encoding | const EncodingPtr\& | L'encodage à utiliser |
| buffer_size | int | La taille du tampon à utiliser |

## Voir aussi

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::StreamWriter(const String\&, bool, const EncodingPtr\&) constructor


Crée une instance de l'objet [StreamWriter](../) qui écrit des caractères dans le fichier spécifié en utilisant l'encodage spécifié et un tampon d'une taille par défaut de 1024 octets. Un paramètre indique si les données doivent être ajoutées au fichier ou si le fichier doit être écrasé.

```cpp
System::IO::StreamWriter::StreamWriter(const String &path, bool append, const EncodingPtr &encoding=System::Text::Encoding::get_UTF8Unmarked())
```


| Paramètre | Type | Description |
| --- | --- | --- |
| chemin | const String\& | Le chemin du fichier dans lequel écrire des caractères |
| append | bool | Indique si les données doivent être ajoutées au fichier spécifié (true) ou si le fichier doit être écrasé (false) |
| encoding | const EncodingPtr\& | L'encodage à utiliser |

## Voir aussi

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
