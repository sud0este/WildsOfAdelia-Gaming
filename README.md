# WildsOfAdelia
Descrição do Projeto (em PT-BR)
Wilds of Adelia vibes no código! 😄
Este projeto é baseado no https://github.com/patrickhoey/BludBourne, usando a biblioteca LibGDX.
É um jogo base de RPG 2D com tudo que a gente curte: mundo aberto, herói explorador, NPCs com diálogos e quests, batalhas épicas e um sistema de progressão bem profundo.
Mapas
Os mapas são inspirados em Sword of Mana (GBA) e na série Seiken Densetsu.
Tudo editado no Tiled.exe pra criar camadas perfeitas, com colisões, eventos e aquele visual pixel art charmoso que lembra os clássicos.
Entidades

O herói é um sprite 2D animado que se move livremente pelos mapas com as setas ou WASD.
Em breve vai interagir com NPCs apertando E (já tá quase lá!).
NPCs também são sprites animados. Dá pra clicar neles quando estiver perto o suficiente. Alguns têm conversas, quests e até histórias profundas.

Tela de Batalha
Sistema de combate por turno clássico!
Mostra o dano causado e recebido, com ataques básicos e uso de itens pra recuperar HP/MP.
Futuramente: várias habilidades, magias, resistências, ultimate attacks com cutscenes iradas e mais!
Tela de Opções
Acessada com a tecla O.
Dividida em:

Configurações de música (som ainda não implementado, mas a música já roda suave)
Controles
Botão de voltar

Inventário
Abre pelo ícone de baú na interface de status.
Dá pra arrastar e soltar itens e usar consumíveis com duplo clique. Super prático!
Level Up
Ao subir de nível (por batalhas ou quests), você distribui pontos extras nos atributos base.
Clássico e viciante!
Perfis / Saves
O jogo salva automaticamente em ações importantes (troca de mapa, pegar quest, etc.).
No menu inicial, escolha Novo Jogo ou Carregar Perfil existente.
Sistema de Classes
Classe base evolui quando você cumpre requisitos. Cada uma ramifica em 2 opções, e essas em mais 2...
Cada upgrade dá bônus em stats, armas e habilidades.
Exemplo da árvore de classes pro guerreiro:
#mermaid-diagram-mermaid-ygz838v{font-family:"trebuchet ms",verdana,arial,sans-serif;font-size:16px;fill:#ccc;}@keyframes edge-animation-frame{from{stroke-dashoffset:0;}}@keyframes dash{to{stroke-dashoffset:0;}}#mermaid-diagram-mermaid-ygz838v .edge-animation-slow{stroke-dasharray:9,5!important;stroke-dashoffset:900;animation:dash 50s linear infinite;stroke-linecap:round;}#mermaid-diagram-mermaid-ygz838v .edge-animation-fast{stroke-dasharray:9,5!important;stroke-dashoffset:900;animation:dash 20s linear infinite;stroke-linecap:round;}#mermaid-diagram-mermaid-ygz838v .error-icon{fill:#a44141;}#mermaid-diagram-mermaid-ygz838v .error-text{fill:#ddd;stroke:#ddd;}#mermaid-diagram-mermaid-ygz838v .edge-thickness-normal{stroke-width:1px;}#mermaid-diagram-mermaid-ygz838v .edge-thickness-thick{stroke-width:3.5px;}#mermaid-diagram-mermaid-ygz838v .edge-pattern-solid{stroke-dasharray:0;}#mermaid-diagram-mermaid-ygz838v .edge-thickness-invisible{stroke-width:0;fill:none;}#mermaid-diagram-mermaid-ygz838v .edge-pattern-dashed{stroke-dasharray:3;}#mermaid-diagram-mermaid-ygz838v .edge-pattern-dotted{stroke-dasharray:2;}#mermaid-diagram-mermaid-ygz838v .marker{fill:lightgrey;stroke:lightgrey;}#mermaid-diagram-mermaid-ygz838v .marker.cross{stroke:lightgrey;}#mermaid-diagram-mermaid-ygz838v svg{font-family:"trebuchet ms",verdana,arial,sans-serif;font-size:16px;}#mermaid-diagram-mermaid-ygz838v p{margin:0;}#mermaid-diagram-mermaid-ygz838v .label{font-family:"trebuchet ms",verdana,arial,sans-serif;color:#ccc;}#mermaid-diagram-mermaid-ygz838v .cluster-label text{fill:#F9FFFE;}#mermaid-diagram-mermaid-ygz838v .cluster-label span{color:#F9FFFE;}#mermaid-diagram-mermaid-ygz838v .cluster-label span p{background-color:transparent;}#mermaid-diagram-mermaid-ygz838v .label text,#mermaid-diagram-mermaid-ygz838v span{fill:#ccc;color:#ccc;}#mermaid-diagram-mermaid-ygz838v .node rect,#mermaid-diagram-mermaid-ygz838v .node circle,#mermaid-diagram-mermaid-ygz838v .node ellipse,#mermaid-diagram-mermaid-ygz838v .node polygon,#mermaid-diagram-mermaid-ygz838v .node path{fill:#1f2020;stroke:#ccc;stroke-width:1px;}#mermaid-diagram-mermaid-ygz838v .rough-node .label text,#mermaid-diagram-mermaid-ygz838v .node .label text,#mermaid-diagram-mermaid-ygz838v .image-shape .label,#mermaid-diagram-mermaid-ygz838v .icon-shape .label{text-anchor:middle;}#mermaid-diagram-mermaid-ygz838v .node .katex path{fill:#000;stroke:#000;stroke-width:1px;}#mermaid-diagram-mermaid-ygz838v .rough-node .label,#mermaid-diagram-mermaid-ygz838v .node .label,#mermaid-diagram-mermaid-ygz838v .image-shape .label,#mermaid-diagram-mermaid-ygz838v .icon-shape .label{text-align:center;}#mermaid-diagram-mermaid-ygz838v .node.clickable{cursor:pointer;}#mermaid-diagram-mermaid-ygz838v .root .anchor path{fill:lightgrey!important;stroke-width:0;stroke:lightgrey;}#mermaid-diagram-mermaid-ygz838v .arrowheadPath{fill:lightgrey;}#mermaid-diagram-mermaid-ygz838v .edgePath .path{stroke:lightgrey;stroke-width:2.0px;}#mermaid-diagram-mermaid-ygz838v .flowchart-link{stroke:lightgrey;fill:none;}#mermaid-diagram-mermaid-ygz838v .edgeLabel{background-color:hsl(0, 0%, 34.4117647059%);text-align:center;}#mermaid-diagram-mermaid-ygz838v .edgeLabel p{background-color:hsl(0, 0%, 34.4117647059%);}#mermaid-diagram-mermaid-ygz838v .edgeLabel rect{opacity:0.5;background-color:hsl(0, 0%, 34.4117647059%);fill:hsl(0, 0%, 34.4117647059%);}#mermaid-diagram-mermaid-ygz838v .labelBkg{background-color:rgba(87.75, 87.75, 87.75, 0.5);}#mermaid-diagram-mermaid-ygz838v .cluster rect{fill:hsl(180, 1.5873015873%, 28.3529411765%);stroke:rgba(255, 255, 255, 0.25);stroke-width:1px;}#mermaid-diagram-mermaid-ygz838v .cluster text{fill:#F9FFFE;}#mermaid-diagram-mermaid-ygz838v .cluster span{color:#F9FFFE;}#mermaid-diagram-mermaid-ygz838v div.mermaidTooltip{position:absolute;text-align:center;max-width:200px;padding:2px;font-family:"trebuchet ms",verdana,arial,sans-serif;font-size:12px;background:hsl(20, 1.5873015873%, 12.3529411765%);border:1px solid rgba(255, 255, 255, 0.25);border-radius:2px;pointer-events:none;z-index:100;}#mermaid-diagram-mermaid-ygz838v .flowchartTitleText{text-anchor:middle;font-size:18px;fill:#ccc;}#mermaid-diagram-mermaid-ygz838v rect.text{fill:none;stroke-width:0;}#mermaid-diagram-mermaid-ygz838v .icon-shape,#mermaid-diagram-mermaid-ygz838v .image-shape{background-color:hsl(0, 0%, 34.4117647059%);text-align:center;}#mermaid-diagram-mermaid-ygz838v .icon-shape p,#mermaid-diagram-mermaid-ygz838v .image-shape p{background-color:hsl(0, 0%, 34.4117647059%);padding:2px;}#mermaid-diagram-mermaid-ygz838v .icon-shape rect,#mermaid-diagram-mermaid-ygz838v .image-shape rect{opacity:0.5;background-color:hsl(0, 0%, 34.4117647059%);fill:hsl(0, 0%, 34.4117647059%);}#mermaid-diagram-mermaid-ygz838v :root{--mermaid-font-family:"trebuchet ms",verdana,arial,sans-serif;}GUERREIROCAVALEIROGLADIADORPALADINOSENHOR_DA_GUERRADUELISTAMESTRE_DAS_ARMAS
Demo (veja os gifs no repo!)
Tem gameplay demo, batalha demo e até uma versão nova com DA (Dynamic Animation? Não dá pra mostrar tudo publicamente ainda, mas é insano!).
Ideia do Jogo (Roadmap)

 Adicionar sons & configurações de som
 Sistema de batalha completo
 Animações de entidades atacando
 Cutscene de ultimate attack
 Implementar stats de magia, resistência, etc.

 Sistema de crafting
 Créditos
 Melhorar IA dos inimigos/NPCs

Bugs conhecidos (a gente tá caçando eles!)

Itens no inventário stackam mesmo não sendo iguais
Efeito de FadeIn não funciona na transição menu → jogo
Problema de seleção no drag & drop (itens ficam longe do mouse ao pegar)
Às vezes o HP/MP atual no HUD ganha um espaço em branco antes do máximo
⚠️ Posição resetada ao fechar o jogo com o X da janela (funciona ok com ESC)

Melhorias planejadas

Mais efeitos de transição
Z-sorting pra camadas de sprites
Colisões melhores com Box2D
Animações no mapa (portas abrindo, água correndo, etc.)

Se você curte RPGs clássicos tipo Secret of Mana, Final Fantasy old-school ou Golden Sun, esse projeto é ouro puro pra quem quer brincar, contribuir ou até usar como base pro seu próprio jogo!
Confere o repo: https://github.com/hdescottes/GdxGame
Tem badge de build, release latest... tudo rodando liso!
