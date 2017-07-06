package aplicacao;

  class Jeops_RuleBase_MiniAgente extends jeops.AbstractRuleBase {

    
    /**
     * Identifiers of rule testeTile
     */
    private String[] identifiers_testeTile = {
        "t"
    };

    /**
     * Returns the identifiers declared in rule testeTile
     *
     * @return the identifiers declared in rule testeTile
     */
    private String[] getDeclaredIdentifiers_testeTile() {
         return identifiers_testeTile;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule testeTile.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_testeTile(int index) {
        switch (index) {
            case 0: return "aplicacao.Tile";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule testeTile.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_testeTile(int index) {
        switch (index) {
            case 0: return aplicacao.Tile.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule testeTile.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_testeTile(int index, Object value) {
        switch (index) {
            case 0: this.aplicacao_Tile_1 = (aplicacao.Tile) value; break;
        }
    }

    /**
     * Returns an object declared in the rule testeTile.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_testeTile(int index) {
        switch (index) {
            case 0: return aplicacao_Tile_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule testeTile
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_testeTile() {
        return new Object[] {
                            aplicacao_Tile_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule testeTile
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_testeTile(Object[] objects) {
        aplicacao_Tile_1 = (aplicacao.Tile) objects[0];
    }

    /**
     * Condition 0 of rule testeTile.<p>
     * The original expression was:<br>
     * <code>t.getOcupado() == Tile.VAZIO</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean testeTile_cond_0() {
        return (aplicacao_Tile_1.getOcupado() == Tile.VAZIO);
    }

    /**
     * Checks whether some conditions of rule testeTile is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean testeTile_cond(int index) {
        switch (index) {
            case 0: return testeTile_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule testeTile that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_testeTile(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!testeTile_cond_0()) return false;
                return true;
            default: return false;
        }
    }

    /**
     * Checks whether all the conditions of a rule which
     * reference some declared element of the declarations are
     * true.
     *
     * @param declIndex the index of the declared element.
     * @return <code>true</code> if the conditions that reference
     *          up to the given declaration are true;
     *          <code>false</code> otherwise.
     */
    private boolean checkCondForDeclaration_testeTile(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule testeTile
     */
    private void testeTile() {
            System.out.println("Tile vazio");
        }


    
    
    /**
     * Identifiers of rule InicializaMapa
     */
    private String[] identifiers_InicializaMapa = {
        "tileMap"
    };

    /**
     * Returns the identifiers declared in rule InicializaMapa
     *
     * @return the identifiers declared in rule InicializaMapa
     */
    private String[] getDeclaredIdentifiers_InicializaMapa() {
         return identifiers_InicializaMapa;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule InicializaMapa.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_InicializaMapa(int index) {
        switch (index) {
            case 0: return "aplicacao.TileMap";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule InicializaMapa.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_InicializaMapa(int index) {
        switch (index) {
            case 0: return aplicacao.TileMap.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule InicializaMapa.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_InicializaMapa(int index, Object value) {
        switch (index) {
            case 0: this.aplicacao_TileMap_1 = (aplicacao.TileMap) value; break;
        }
    }

    /**
     * Returns an object declared in the rule InicializaMapa.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_InicializaMapa(int index) {
        switch (index) {
            case 0: return aplicacao_TileMap_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule InicializaMapa
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_InicializaMapa() {
        return new Object[] {
                            aplicacao_TileMap_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule InicializaMapa
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_InicializaMapa(Object[] objects) {
        aplicacao_TileMap_1 = (aplicacao.TileMap) objects[0];
    }

    /**
     * Condition 0 of rule InicializaMapa.<p>
     * The original expression was:<br>
     * <code>tileMap == null</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean InicializaMapa_cond_0() {
        return (aplicacao_TileMap_1 == null);
    }

    /**
     * Checks whether some conditions of rule InicializaMapa is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean InicializaMapa_cond(int index) {
        switch (index) {
            case 0: return InicializaMapa_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule InicializaMapa that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_InicializaMapa(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!InicializaMapa_cond_0()) return false;
                return true;
            default: return false;
        }
    }

    /**
     * Checks whether all the conditions of a rule which
     * reference some declared element of the declarations are
     * true.
     *
     * @param declIndex the index of the declared element.
     * @return <code>true</code> if the conditions that reference
     *          up to the given declaration are true;
     *          <code>false</code> otherwise.
     */
    private boolean checkCondForDeclaration_InicializaMapa(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule InicializaMapa
     */
    private void InicializaMapa() {
            System.out.println("inicializou mapa");
            aplicacao_TileMap_1 = new TileMap();
            aplicacao_TileMap_1.geraElementos();
            modified(aplicacao_TileMap_1);
        }


    
    
    /**
     * Identifiers of rule InicializaPersonagem
     */
    private String[] identifiers_InicializaPersonagem = {
        "personagem"
    };

    /**
     * Returns the identifiers declared in rule InicializaPersonagem
     *
     * @return the identifiers declared in rule InicializaPersonagem
     */
    private String[] getDeclaredIdentifiers_InicializaPersonagem() {
         return identifiers_InicializaPersonagem;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule InicializaPersonagem.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_InicializaPersonagem(int index) {
        switch (index) {
            case 0: return "aplicacao.Personagem";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule InicializaPersonagem.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_InicializaPersonagem(int index) {
        switch (index) {
            case 0: return aplicacao.Personagem.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule InicializaPersonagem.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_InicializaPersonagem(int index, Object value) {
        switch (index) {
            case 0: this.aplicacao_Personagem_1 = (aplicacao.Personagem) value; break;
        }
    }

    /**
     * Returns an object declared in the rule InicializaPersonagem.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_InicializaPersonagem(int index) {
        switch (index) {
            case 0: return aplicacao_Personagem_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule InicializaPersonagem
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_InicializaPersonagem() {
        return new Object[] {
                            aplicacao_Personagem_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule InicializaPersonagem
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_InicializaPersonagem(Object[] objects) {
        aplicacao_Personagem_1 = (aplicacao.Personagem) objects[0];
    }

    /**
     * Condition 0 of rule InicializaPersonagem.<p>
     * The original expression was:<br>
     * <code>personagem == null</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean InicializaPersonagem_cond_0() {
        return (aplicacao_Personagem_1 == null);
    }

    /**
     * Checks whether some conditions of rule InicializaPersonagem is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean InicializaPersonagem_cond(int index) {
        switch (index) {
            case 0: return InicializaPersonagem_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule InicializaPersonagem that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_InicializaPersonagem(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!InicializaPersonagem_cond_0()) return false;
                return true;
            default: return false;
        }
    }

    /**
     * Checks whether all the conditions of a rule which
     * reference some declared element of the declarations are
     * true.
     *
     * @param declIndex the index of the declared element.
     * @return <code>true</code> if the conditions that reference
     *          up to the given declaration are true;
     *          <code>false</code> otherwise.
     */
    private boolean checkCondForDeclaration_InicializaPersonagem(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule InicializaPersonagem
     */
    private void InicializaPersonagem() {
            System.out.println("inicializou personagem");
            aplicacao_Personagem_1 = new Personagem();
            modified(aplicacao_Personagem_1);
        }


    
    
    /**
     * Identifiers of rule tileAtual
     */
    private String[] identifiers_tileAtual = {
        "tileMap",
        "personagem",
        "tile"
    };

    /**
     * Returns the identifiers declared in rule tileAtual
     *
     * @return the identifiers declared in rule tileAtual
     */
    private String[] getDeclaredIdentifiers_tileAtual() {
         return identifiers_tileAtual;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule tileAtual.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_tileAtual(int index) {
        switch (index) {
            case 0: return "aplicacao.TileMap";
            case 1: return "aplicacao.Personagem";
            case 2: return "aplicacao.Tile";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule tileAtual.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_tileAtual(int index) {
        switch (index) {
            case 0: return aplicacao.TileMap.class;
            case 1: return aplicacao.Personagem.class;
            case 2: return aplicacao.Tile.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule tileAtual.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_tileAtual(int index, Object value) {
        switch (index) {
            case 0: this.aplicacao_TileMap_1 = (aplicacao.TileMap) value; break;
            case 1: this.aplicacao_Personagem_1 = (aplicacao.Personagem) value; break;
            case 2: this.aplicacao_Tile_1 = (aplicacao.Tile) value; break;
        }
    }

    /**
     * Returns an object declared in the rule tileAtual.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_tileAtual(int index) {
        switch (index) {
            case 0: return aplicacao_TileMap_1;
            case 1: return aplicacao_Personagem_1;
            case 2: return aplicacao_Tile_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule tileAtual
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_tileAtual() {
        return new Object[] {
                            aplicacao_TileMap_1,
                            aplicacao_Personagem_1,
                            aplicacao_Tile_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule tileAtual
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_tileAtual(Object[] objects) {
        aplicacao_TileMap_1 = (aplicacao.TileMap) objects[0];
        aplicacao_Personagem_1 = (aplicacao.Personagem) objects[1];
        aplicacao_Tile_1 = (aplicacao.Tile) objects[2];
    }

    /**
     * Condition 0 of rule tileAtual.<p>
     * The original expression was:<br>
     * <code>personagem.nextTile()</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean tileAtual_cond_0() {
        return (aplicacao_Personagem_1.nextTile());
    }

    /**
     * Condition 1 of rule tileAtual.<p>
     * The original expression was:<br>
     * <code>tile == null</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean tileAtual_cond_1() {
        return (aplicacao_Tile_1 == null);
    }

    /**
     * Checks whether some conditions of rule tileAtual is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean tileAtual_cond(int index) {
        switch (index) {
            case 0: return tileAtual_cond_0();
            case 1: return tileAtual_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule tileAtual that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_tileAtual(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!tileAtual_cond_0()) return false;
                return true;
            case 2:
                if (!tileAtual_cond_1()) return false;
                return true;
            default: return false;
        }
    }

    /**
     * Checks whether all the conditions of a rule which
     * reference some declared element of the declarations are
     * true.
     *
     * @param declIndex the index of the declared element.
     * @return <code>true</code> if the conditions that reference
     *          up to the given declaration are true;
     *          <code>false</code> otherwise.
     */
    private boolean checkCondForDeclaration_tileAtual(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            case 2:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule tileAtual
     */
    private void tileAtual() {
            System.out.println("inicializou personagem");
            Integer posX = aplicacao_Personagem_1.getPosX();
            Integer posY = aplicacao_Personagem_1.getPosY();
            aplicacao_Tile_1 = aplicacao_TileMap_1.getTile(posX, posY);
            modified(aplicacao_Tile_1);
        }


    
       
    /**
     * Identifiers of rule Andar
     */
    private String[] identifiers_Andar = {
        "tileMap",
        "personagem",
        "tile"
    };

    /**
     * Returns the identifiers declared in rule Andar
     *
     * @return the identifiers declared in rule Andar
     */
    private String[] getDeclaredIdentifiers_Andar() {
         return identifiers_Andar;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule Andar.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_Andar(int index) {
        switch (index) {
            case 0: return "aplicacao.TileMap";
            case 1: return "aplicacao.Personagem";
            case 2: return "aplicacao.Tile";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule Andar.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_Andar(int index) {
        switch (index) {
            case 0: return aplicacao.TileMap.class;
            case 1: return aplicacao.Personagem.class;
            case 2: return aplicacao.Tile.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule Andar.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_Andar(int index, Object value) {
        switch (index) {
            case 0: this.aplicacao_TileMap_1 = (aplicacao.TileMap) value; break;
            case 1: this.aplicacao_Personagem_1 = (aplicacao.Personagem) value; break;
            case 2: this.aplicacao_Tile_1 = (aplicacao.Tile) value; break;
        }
    }

    /**
     * Returns an object declared in the rule Andar.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_Andar(int index) {
        switch (index) {
            case 0: return aplicacao_TileMap_1;
            case 1: return aplicacao_Personagem_1;
            case 2: return aplicacao_Tile_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule Andar
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_Andar() {
        return new Object[] {
                            aplicacao_TileMap_1,
                            aplicacao_Personagem_1,
                            aplicacao_Tile_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule Andar
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_Andar(Object[] objects) {
        aplicacao_TileMap_1 = (aplicacao.TileMap) objects[0];
        aplicacao_Personagem_1 = (aplicacao.Personagem) objects[1];
        aplicacao_Tile_1 = (aplicacao.Tile) objects[2];
    }

    /**
     * Condition 0 of rule Andar.<p>
     * The original expression was:<br>
     * <code>personagem.nextTile()</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean Andar_cond_0() {
        return (aplicacao_Personagem_1.nextTile());
    }

    /**
     * Condition 1 of rule Andar.<p>
     * The original expression was:<br>
     * <code>(tileMap.getTerrenoAt(personagem.getProximaPosicao()) == Tile.GRAMA
            || (tileMap.getTerrenoAt(personagem.getProximaPosicao()) == Tile.MONTANHA &&
            personagem.isMontanha())
            )</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean Andar_cond_1() {
        return ((aplicacao_TileMap_1.getTerrenoAt(aplicacao_Personagem_1.getProximaPosicao()) == Tile.GRAMA
            || (aplicacao_TileMap_1.getTerrenoAt(aplicacao_Personagem_1.getProximaPosicao()) == Tile.MONTANHA &&
            aplicacao_Personagem_1.isMontanha())
            ));
    }

    /**
     * Condition 2 of rule Andar.<p>
     * The original expression was:<br>
     * <code>tile.getOcupado() == Tile.VAZIO</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean Andar_cond_2() {
        return (aplicacao_Tile_1.getOcupado() == Tile.VAZIO);
    }

    /**
     * Checks whether some conditions of rule Andar is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean Andar_cond(int index) {
        switch (index) {
            case 0: return Andar_cond_0();
            case 1: return Andar_cond_1();
            case 2: return Andar_cond_2();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule Andar that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_Andar(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!Andar_cond_0()) return false;
                return true;
            case 2:
                if (!Andar_cond_2()) return false;
                return true;
            default: return false;
        }
    }

    /**
     * Checks whether all the conditions of a rule which
     * reference some declared element of the declarations are
     * true.
     *
     * @param declIndex the index of the declared element.
     * @return <code>true</code> if the conditions that reference
     *          up to the given declaration are true;
     *          <code>false</code> otherwise.
     */
    private boolean checkCondForDeclaration_Andar(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!Andar_cond_1()) return false;
                return true;
            case 2:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule Andar
     */
    private void Andar() {
            System.out.println("Andou só de teste na grama");
            aplicacao_Personagem_1.andar();
            modified(aplicacao_Personagem_1);
        }


 
    

    /**
     * The names of the rules in this class file
     */
    private static final String[] File_ruleNames = {
        "testeTile",
        "InicializaMapa",
        "InicializaPersonagem",
        "tileAtual",
        "Andar"
    };

    /**
     * Returns the name of the rules in this class file.
     *
     * @return the name of the rules in this class file.
     */
    public String[] getRuleNames() {
        return File_ruleNames;
    }

    /**
     * The number of declarations of the rules in this class file.
     */
    private static final int[] File_numberOfDeclarations = {
        1,
        1,
        1,
        3,
        3
    };

    /**
     * Returns the number of declarations of the rules in this class file.
     *
     * @return the number of declarations  of the rules in this class file.
     */
    public int[] getNumberOfDeclarations() {
        return File_numberOfDeclarations;
    }

    /**
     * The number of conditions of the rules in this class file.
     */
    private static final int[] File_numberOfConditions = {
        1,
        1,
        1,
        2,
        3
    };

    /**
     * Returns the number of conditions of the rules in this class file.
     *
     * @return the number of conditions  of the rules in this class file.
     */
    public int[] getNumberOfConditions() {
        return File_numberOfConditions;
    }

    /**
     * Checks whether a condition of some rule is satisfied.
     *
     * @param ruleIndex the index of the rule to be checked
     * @param condIndex the index of the condition to be checked
     * @return <code>true</code> if the corresponding condition for the
     *          given rule is satisfied. <code>false</code> otherwise.
     */
    public boolean checkCondition(int ruleIndex, int condIndex) {
        switch (ruleIndex) {
            case 0: return testeTile_cond(condIndex);
            case 1: return InicializaMapa_cond(condIndex);
            case 2: return InicializaPersonagem_cond(condIndex);
            case 3: return tileAtual_cond(condIndex);
            case 4: return Andar_cond(condIndex);
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of some rule that depend only on
     * the given object are satisfied.
     *
     * @param ruleIndex the index of the rule to be checked
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          the given rule are satisfied;
     *           <code>false</code> otherwise.
     */
    public boolean checkConditionsOnlyOf(int ruleIndex, int declIndex) {
        switch (ruleIndex) {
            case 0: return checkConditionsOnlyOf_testeTile(declIndex);
            case 1: return checkConditionsOnlyOf_InicializaMapa(declIndex);
            case 2: return checkConditionsOnlyOf_InicializaPersonagem(declIndex);
            case 3: return checkConditionsOnlyOf_tileAtual(declIndex);
            case 4: return checkConditionsOnlyOf_Andar(declIndex);
            default: return false;
        }
    }

    /**
     * Checks whether all the conditions of a rule which
     * reference only the elements declared up to the given index
     * are true.
     *
     * @param ruleIndex the index of the rule to be checked
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all the conditions of a rule which
     *          reference only the elements declared up to the given index
     *          are satisfied; <code>false</code> otherwise.
     */
    public boolean checkCondForDeclaration(int ruleIndex, int declIndex) {
        switch (ruleIndex) {
            case 0: return checkCondForDeclaration_testeTile(declIndex);
            case 1: return checkCondForDeclaration_InicializaMapa(declIndex);
            case 2: return checkCondForDeclaration_InicializaPersonagem(declIndex);
            case 3: return checkCondForDeclaration_tileAtual(declIndex);
            case 4: return checkCondForDeclaration_Andar(declIndex);
            default: return false;
        }
    }

    /**
     * Returns the class name of an object declared in a rule.
     *
     * @param ruleIndex the index of the rule
     * @param declIndex the index of the declaration
     * @return the class name of the declared object.
     */
    public String getDeclaredClassName(int ruleIndex, int declIndex) {
        switch (ruleIndex) {
            case 0: return getDeclaredClassName_testeTile(declIndex);
            case 1: return getDeclaredClassName_InicializaMapa(declIndex);
            case 2: return getDeclaredClassName_InicializaPersonagem(declIndex);
            case 3: return getDeclaredClassName_tileAtual(declIndex);
            case 4: return getDeclaredClassName_Andar(declIndex);
            default: return null;
        }
    }

    /**
     * Returns the class of an object declared in a rule.
     *
     * @param ruleIndex the index of the rule
     * @param declIndex the index of the declaration
     * @return the class of the declared object.
     */
    public Class getDeclaredClass(int ruleIndex, int declIndex) {
        switch (ruleIndex) {
            case 0: return getDeclaredClass_testeTile(declIndex);
            case 1: return getDeclaredClass_InicializaMapa(declIndex);
            case 2: return getDeclaredClass_InicializaPersonagem(declIndex);
            case 3: return getDeclaredClass_tileAtual(declIndex);
            case 4: return getDeclaredClass_Andar(declIndex);
            default: return null;
        }
    }

    /**
     * Fires one of the rules in this rule base.
     *
     * @param ruleIndex the index of the rule to be fired
     */
    protected void internalFireRule(int ruleIndex) {
        switch (ruleIndex) {
            case 0: testeTile(); break;
            case 1: InicializaMapa(); break;
            case 2: InicializaPersonagem(); break;
            case 3: tileAtual(); break;
            case 4: Andar(); break;
        }
    }

    /**
     * Returns the number of rules.
     *
     * @return the number of rules.
     */
    public int getNumberOfRules() {
        return 5;
    }

    /**
     * Returns the identifiers declared in a given rule.
     *
     * @param ruleIndex the index of the rule.
     * @return an array with the identifiers of the rule declarations.
     */
    public String[] getDeclaredIdentifiers(int ruleIndex) {
        switch (ruleIndex) {
            case 0: return getDeclaredIdentifiers_testeTile();
            case 1: return getDeclaredIdentifiers_InicializaMapa();
            case 2: return getDeclaredIdentifiers_InicializaPersonagem();
            case 3: return getDeclaredIdentifiers_tileAtual();
            case 4: return getDeclaredIdentifiers_Andar();
            default: return new String[0];
        }
    }

    /**
     * Sets an object that represents a declaration of some rule.
     *
     * @param ruleIndex the index of the rule
     * @param declIndex the index of the declaration in the rule.
     * @param value the value of the object being set.
     */
    public void setObject(int ruleIndex, int declIndex, Object value) {
        switch (ruleIndex) {
            case 0: setObject_testeTile(declIndex, value); break;
            case 1: setObject_InicializaMapa(declIndex, value); break;
            case 2: setObject_InicializaPersonagem(declIndex, value); break;
            case 3: setObject_tileAtual(declIndex, value); break;
            case 4: setObject_Andar(declIndex, value); break;
        }
    }

    /**
     * Returns an object that represents a declaration of some rule.
     *
     * @param ruleIndex the index of the rule
     * @param declIndex the index of the declaration in the rule.
     * @return the value of the corresponding object.
     */
    public Object getObject(int ruleIndex, int declIndex) {
        switch (ruleIndex) {
            case 0: return getObject_testeTile(declIndex);
            case 1: return getObject_InicializaMapa(declIndex);
            case 2: return getObject_InicializaPersonagem(declIndex);
            case 3: return getObject_tileAtual(declIndex);
            case 4: return getObject_Andar(declIndex);
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations of
     * some rule.
     *
     * @param ruleIndex the index of the rule
     * @return an object array of the variables bound to the
     *          declarations of some rule.
     */
    public Object[] getObjects(int ruleIndex) {
        switch (ruleIndex) {
            case 0: return getObjects_testeTile();
            case 1: return getObjects_InicializaMapa();
            case 2: return getObjects_InicializaPersonagem();
            case 3: return getObjects_tileAtual();
            case 4: return getObjects_Andar();
            default: return null;
        }
    }
    /**
     * Defines all variables bound to the declarations of
     * some rule.
     *
     * @param ruleIndex the index of the rule
     * @param objects an object array of the variables bound to the
     *          declarations of some rule.
     */
    public void setObjects(int ruleIndex, Object[] objects) {
        switch (ruleIndex) {
            case 0: setObjects_testeTile(objects); break;
            case 1: setObjects_InicializaMapa(objects); break;
            case 2: setObjects_InicializaPersonagem(objects); break;
            case 3: setObjects_tileAtual(objects); break;
            case 4: setObjects_Andar(objects); break;
        }
    }

    /*
     * The variables declared in the rules.
     */
    private aplicacao.Tile aplicacao_Tile_1;
    private aplicacao.TileMap aplicacao_TileMap_1;
    private aplicacao.Personagem aplicacao_Personagem_1;

    /**
     * Class constructor.
     *
     * @param knowledgeBase the knowledge base that contains this rule base.
     */
    public Jeops_RuleBase_MiniAgente(jeops.AbstractKnowledgeBase knowledgeBase) {
        super(knowledgeBase);
    }

}
/**
 * Knowledge base created by JEOPS from file MiniAgente.rules
 *
 * @version 06/07/2017
 */
public class MiniAgente extends jeops.AbstractKnowledgeBase {

    /**
     * Creates a new knowledge base with the specified conflict set with the
     * desired conflict resolution policy.
     *
     * @param conflictSet a conflict set with the desired resolution policy
     */
    public MiniAgente(jeops.conflict.ConflictSet conflictSet) {
        super(conflictSet);
    }

    /**
     * Creates a new knowledge base, using the default conflict resolution
     * policy.
     */
    public MiniAgente() {
        this(new jeops.conflict.DefaultConflictSet());
    }

    /**
     * Factory method used to instantiate the rule base.
     */
    protected jeops.AbstractRuleBase createRuleBase() {
        return new Jeops_RuleBase_MiniAgente(this);
    }

}
