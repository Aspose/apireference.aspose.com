---
title: "System::Drawing::Drawing2D::CustomLineCap classe"
linktitle: "CustomLineCap"
second_title: "Aspose.Font pour C++"
description: "System::Drawing::Drawing2D::CustomLineCap classe. Représente un cap de ligne défini par l'utilisateur. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 400
url: /fr/cpp/system.drawing.drawing2d/customlinecap/
---
## CustomLineCap class


Représente un cap de ligne défini par l'utilisateur. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
class CustomLineCap : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [Clone](./clone/)() | Renvoie une copie de l'objet actuel. |
| [CustomLineCap](./customlinecap/)(const SharedPtr\<GraphicsPath\>\&, const SharedPtr\<GraphicsPath\>\&, LineCap, float) | Construit une nouvelle instance de la classe [CustomLineCap](./) qui représente un cap de ligne défini par l'utilisateur avec les propriétés spécifiées. |
| [Dispose](./dispose/)() | Libère toutes les ressources du système d'exploitation acquises par l'objet actuel. |
| [get_BaseCap](./get_basecap/)() const | Renvoie le cap de ligne de base à partir duquel ce cap personnalisé est créé. |
| [get_BaseInset](./get_baseinset/)() const | Renvoie la distance entre la ligne et le cap. |
| [get_StrokeJoin](./get_strokejoin/)() const | Renvoie la valeur [LineJoin](../linejoin/) qui détermine comment les lignes de ce cap personnalisé sont jointes. |
| [get_WidthScale](./get_widthscale/)() const | Renvoie l'échelle de ce cap personnalisé. |
| [GetStrokeCaps](./getstrokecaps/)(LineCap\&, LineCap\&) | Obtient les caps de ligne de début et de fin du cap personnalisé représenté par l'objet actuel. |
| [set_BaseCap](./set_basecap/)(LineCap) | Définit la valeur du cap de ligne de base pour ce cap personnalisé. |
| [set_BaseInset](./set_baseinset/)(float) | Définit la distance entre la ligne et le cap. |
| [set_StrokeJoin](./set_strokejoin/)(LineJoin) | Définit la valeur [LineJoin](../linejoin/) qui détermine comment les lignes de ce cap personnalisé sont jointes. |
| [set_WidthScale](./set_widthscale/)(float) | Définit la valeur d'échelle de ce cap personnalisé. |
| [SetStrokeCaps](./setstrokecaps/)(LineCap, LineCap) | Définit les caps de ligne de début et de fin du cap personnalisé représenté par l'objet actuel. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Font for C++](../../)
