
# Git Introducción 

---

## ¿Qué es Git?

Git es un sistema de **control de versiones distribuido**, rápido y escalable.

En términos simples: Git gestiona los cambios realizados en una base de código a lo largo del desarrollo de un proyecto.

---

## Herramientas, Servicios y Clientes

Git se distribuye como un programa de **interfaz de línea de comandos (CLI)**. Este documento cubre los comandos y conceptos principales de CLI.

### Clientes GUI

Los clientes GUI proporcionan una vista gráfica amigable de lo que Git está haciendo en segundo plano. Usan las mismas acciones subyacentes de Git pero pueden no exponer todo el poder de la CLI. Para la mayoría de los flujos de trabajo, esto no es una limitación.

- [Lista incompleta de clientes GUI basados en Windows para Git](https://git-scm.com/downloads/guis)

### Servicios de Hosting y Repositorios Remotos

Git es un sistema de control de versiones **distribuido** — puede rastrear archivos a través de repositorios relacionados pero remotos. El historial de cambios se almacena localmente en una carpeta oculta `.git`. Esta carpeta no debe editarse manualmente; los comandos de Git la gestionan.

Los servicios de hosting populares (GitHub, GitLab, Bitbucket, etc.) proporcionan almacenamiento en línea para repositorios remotos y funciones de conveniencia. El control de versiones en sí es manejado por Git localmente; el servicio solo almacena y sincroniza una copia remota.

## PREREQUISITOS 
- [ ] tener git
- [ ] tener algun editor
- [ ] tener cuenta de GitHub

---

## COMANDOS BASICOS

### Flujo de trabajo tipico

```
Editar algun archivo -> añadir los nuevos cambios -> confirmar los nuevos cambios -> pushearlos a nuestro repo remoto 
```

### Configuracion de Git

```bash
git config --global user.name "Tu Nombre"
git config --global user.email "tu@email.com"
git config --global color.ui auto
git config --global core.editor <"editor-ejecutable"> 
```

**Ejemplo** : 
```bash
git config --global user.name "KenjiCasado"
git config --global user.email "kenji.casado@opendeusto.com"
git config --global color.ui auto
```
```
```

**Eligue tu editor** :   

```bash
git config --global core.editor "code --wait"      # VS Code
git config --global core.editor "vim"              # Vim
git config --global core.editor "nano"             # Nano
git config --global core.editor "subl -n -w"       # Sublime Text
git config --global core.editor "atom --wait"       # Atom
git config --global core.editor "notepad++"         # Notepad++ (Windows)
git config --global core.editor "mate -w"           # TextMate (macOS)
git config --global core.editor "kate"              # Kate
git config --global core.editor "gedit -w -s"       # Gedit
```

---

## Creacion de Repositorio  
Crear un Repositorio vacio o reinicializar uno existente:

```bash
git init
```

Esto crea un subdirectorio `.git` que define y gestiona el repositorio.

---

## Seguimiento de Archivos (git status)

Los archivos pueden existir en cuatro estados:

| Estado | Descripción |
|--------|-------------|
| **Untracked** | No siendo considerado por Git |
| **Unmodified** | Rastreado, pero sin cambios desde la última confirmación |
| **Modified** | Rastreado y cambiado desde la última confirmación |
| **Staged** | Rastreado, actualizado, pero aún no confirmado |

Ver qué está preparado en cualquier momento:

```bash
git status
```

> **Tip:** Agrega archivos manualmente y deliberadamente en lugar de preparar todo de una vez. Cada commit debe representar un cambio significativo.

---

## Agregar files (git add)

Añadir nuestros cambios actuales y preparalos para nuestro proxima confirmacion (commit)

```bash
git add <archivo>          # Preparar un archivo específico
git add -A              # Preparar todos los cambios (excepto archivos ignorados)
git add -p <archivo>       # Seleccionar interactivamente qué cambios preparar
```

**Ejemplo** : 
```bash
git add README.md
```


Para deshacer la preparación de un archivo:

```bash
git rm --cached <nombrearchivo>
```

---

## Como hacer una confirmación (Commitear)

Una confirmación registra una instantánea de los cambios preparados en el historial del proyecto.

```bash
git commit                  # Abre el editor para el mensaje de confirmación
git commit -m '<mensaje>'   # Confirma con un mensaje en línea
```

---

## Ramas 

Una rama es una ruta independiente de desarrollo. Usa ramas para trabajar en características de forma aislada sin afectar la base de código principal. Una vez estable, fusiona la rama de vuelta.

### Comandos Comunes

```bash
git checkout -b <nombre>    # Crear y cambiar a una nueva rama
git checkout <nombre>       # Cambiar a una rama existente
git merge <nombre>          # Fusionar la rama <nombre> en la rama actual
```

**Flujo típico:**

1. Crea una rama de característica: `git checkout -b feature_x`
2. Haz tu trabajo y confirma
3. Vuelve a `master`: `git checkout master`
4. Fusiona: `git merge feature_x`

> **Consejo:** para tener la branch nueva en el repositorio remoto

```bash
git push -u origin feature_x # Crear y cambiar a una nueva rama
```


