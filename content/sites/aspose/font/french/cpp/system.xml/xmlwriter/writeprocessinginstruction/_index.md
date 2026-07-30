---
title: "System::Xml::XmlWriter::WriteProcessingInstruction méthode"
linktitle: "WriteProcessingInstruction"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XmlWriter::WriteProcessingInstruction méthode. Lorsqu'elle est remplacée dans une classe dérivée, elle écrit une instruction de traitement avec un espace entre le nom et le texte comme suit : <?name text?> en C++."
type: docs
weight: 2700
url: /fr/cpp/system.xml/xmlwriter/writeprocessinginstruction/
---
## XmlWriter::WriteProcessingInstruction method


Lorsqu'il est remplacé dans une classe dérivée, écrit une instruction de traitement avec un espace entre le nom et le texte comme suit : **<?name text?>**.

```cpp
virtual void System::Xml::XmlWriter::WriteProcessingInstruction(String name, String text)=0
```


| Paramètre | Type | Description |
| --- | --- | --- |
| nom | String | Le nom de l'instruction de traitement. |
| texte | String | Le texte à inclure dans l'instruction de traitement. |
## Remarques



Cette méthode est utilisée pour créer une déclaration XML après que [XmlWriter::WriteStartDocument](../writestartdocument/) a déjà été appelée.
## Voir aussi

* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
