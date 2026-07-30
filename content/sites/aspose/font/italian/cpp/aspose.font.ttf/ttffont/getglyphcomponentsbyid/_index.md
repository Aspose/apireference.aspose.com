---
title: "Metodo Aspose::Font::Ttf::TtfFont::GetGlyphComponentsById"
linktitle: "GetGlyphComponentsById"
second_title: "Aspose.Font per C++"
description: "Metodo Aspose::Font::Ttf::TtfFont::GetGlyphComponentsById. Ottiene un glifo mediante l'identificatore di glifo fornito e riempie l'elenco di identificatori di glifo fornito con i componenti di questo glifo. L'id del glifo è un numero univoco per un glifo, dipendente dal tipo di carattere. L'id del glifo del Font TTF può essere un'istanza della classe (GlyphStringId) o della classe (GlyphUInt32Id). È supportato l'indirizzamento dei glifi per nome (stringa) per i Font TTF tramite la mappatura della tabella Post. Nel caso di un Font CFF interno, le strutture CFF sono usate per indirizzare i glifi per nome in C++."
type: docs
weight: 1900
url: /it/cpp/aspose.font.ttf/ttffont/getglyphcomponentsbyid/
---
## TtfFont::GetGlyphComponentsById(System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::GlyphIdList\>) method


Ottiene un glifo mediante l'identificatore di glifo fornito e riempie l'elenco di identificatori di glifo fornito con i componenti di questo glifo. L'id del glifo è un numero univoco per un glifo, dipendente dal tipo di carattere. L'id del glifo del [Font](../../../aspose.font/font/) TTF può essere un'istanza della classe ([GlyphStringId](../)) o della classe ([GlyphUInt32Id](../)). L'indirizzamento dei glifi per nome (stringa) è supportato per i Font TTF tramite la mappatura della tabella Post. Nel caso di un [Font](../../../aspose.font/font/) CFF interno, le strutture CFF sono usate per indirizzare i glifi per nome.

```cpp
virtual void Aspose::Font::Ttf::TtfFont::GetGlyphComponentsById(System::SharedPtr<Glyphs::GlyphId> id, System::SharedPtr<Glyphs::GlyphIdList> componentsToPopulate)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| id | System::SharedPtr\<Glyphs::GlyphId\> | Id del glifo. |
| componentsToPopulate | System::SharedPtr\<Glyphs::GlyphIdList\> | Elenco di identificatori di glifo da riempire. |
## Osservazioni


È necessario passare una collezione vuota componentsToPopulate che conterrà l'elenco degli id dei componenti del glifo.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [GlyphIdList](../../../aspose.font.glyphs/glyphidlist/)
* Class [TtfFont](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
## TtfFont::GetGlyphComponentsById(System::String, System::SharedPtr\<Glyphs::GlyphIdList\>) method


Ottiene un glifo per nome del glifo fornito e riempie la lista di identificatori di glifi fornita con i componenti di questo glifo.

```cpp
void Aspose::Font::Ttf::TtfFont::GetGlyphComponentsById(System::String glyphName, System::SharedPtr<Glyphs::GlyphIdList> componentsToPopulate)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| glyphName | System::String | Nome del glifo. |
| componentsToPopulate | System::SharedPtr\<Glyphs::GlyphIdList\> | Elenco di identificatori di glifo da riempire. |
## Osservazioni


È necessario passare una collezione vuota componentsToPopulate che conterrà l'elenco degli id dei componenti del glifo.

## Vedi anche

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphIdList](../../../aspose.font.glyphs/glyphidlist/)
* Class [TtfFont](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
## TtfFont::GetGlyphComponentsById(uint32_t, System::SharedPtr\<Glyphs::GlyphIdList\>) method


Ottiene un glifo per indice del glifo fornito e riempie la lista di identificatori di glifi fornita con i componenti di questo glifo.

```cpp
void Aspose::Font::Ttf::TtfFont::GetGlyphComponentsById(uint32_t id, System::SharedPtr<Glyphs::GlyphIdList> componentsToPopulate)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| id | uint32_t | Indice del glifo. |
| componentsToPopulate | System::SharedPtr\<Glyphs::GlyphIdList\> | Elenco di identificatori di glifo da riempire. |
## Osservazioni


È necessario passare una collezione vuota componentsToPopulate che conterrà l'elenco degli id dei componenti del glifo.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphIdList](../../../aspose.font.glyphs/glyphidlist/)
* Class [TtfFont](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
