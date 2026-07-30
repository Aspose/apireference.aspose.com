---
title: "Classe System::Drawing::Printing::PrintPageEventArgs"
linktitle: "PrintPageEventArgs"
second_title: "Aspose.Font pour C++"
description: "Classe System::Drawing::Printing::PrintPageEventArgs. Fournit des données pour l'événement PrintPage. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en argument en C++."
type: docs
weight: 900
url: /fr/cpp/system.drawing.printing/printpageeventargs/
---
## PrintPageEventArgs class


Fournit des données pour l'événement PrintPage. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en argument.

```cpp
class PrintPageEventArgs : public System::EventArgs
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_Graphics](./get_graphics/)() | NON IMPLEMENTÉ. |
| [get_HasMorePages](./get_hasmorepages/)() | NON IMPLEMENTÉ. |
| [get_PageSettings](./get_pagesettings/)() | NON IMPLEMENTÉ. |
| [PrintPageEventArgs](./printpageeventargs/)(const SharedPtr\<Graphics\>\&, const SharedPtr\<Rectangle\>\&, const SharedPtr\<Rectangle\>\&, const SharedPtr\<PageSettings\>\&) | Construit une nouvelle instance de la classe [PrintPageEventArgs](./). |
| [set_HasMorePages](./set_hasmorepages/)(bool) | NON IMPLEMENTÉ. |
## Champs

| Champ | Description |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Un membre statique qui représente un pointeur partagé "vide" [EventArgs](../../system/eventargs/) (pointeur nul). |
## Typedefs

| Typedef | Description |
| --- | --- |
| [ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Voir aussi

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::Drawing::Printing](../)
* Library [Aspose.Font for C++](../../)
